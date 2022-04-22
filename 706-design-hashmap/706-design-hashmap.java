/*class MyHashMap {
    int[] map;

    public MyHashMap() {
     map=new int[1000001];
     //for(int i=0;i<map.length;i++) map[i]=-1;   
    }
    
    public void put(int key, int value) {
        map[key]=value+1;
    }
    
    public int get(int key) {
        return map[key]-1;
    }
    
    public void remove(int key) {
        map[key]=0;
    }
}*/

class MyHashMap {
       LinkedList<Entry> [] map;
       public static int SIZE=769;

    public MyHashMap() {
        map=new LinkedList[SIZE];
    }
    
    public void put(int key, int value) {
     int bucket=key%SIZE;
     if(map[bucket]==null){
          map[bucket]=new LinkedList<Entry>();
          map[bucket].add(new Entry(key,value));
         }else{
                 for(Entry entry:map[bucket]){
                       if(entry.key==key){
                          entry.val=value; 
                           return;}
                       }
              map[bucket].add(new Entry(key,value));
                 }
    }
    
    public int get(int key) {
        int bucket=key%SIZE;
        LinkedList<Entry> entries=map[bucket];
        if(entries==null) return -1;
        for(Entry entry : entries){
               if(entry.key==key){
                  return entry.val;  
                  }
          }
        return -1;
    }
    
    public void remove(int key) {
       int bucket=key%SIZE;
       Entry toRemove=null;
       if(map[bucket]==null){ return;}
       else{ 
             for(Entry entry:map[bucket]){
                   if(entry.key==key){
                      
                           toRemove=entry;
                            
                      }

                  }
             if(toRemove==null) return;
               map[bucket].remove(toRemove);
        }
    }
}

class Entry{
   public  int key;
     public int val;
     
   public Entry(int key,int val){
          this.key=key;
          this.val=val;
      }
     
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */