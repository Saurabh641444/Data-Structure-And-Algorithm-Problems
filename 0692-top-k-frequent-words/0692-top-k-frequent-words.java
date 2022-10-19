class Pair {
    
    private String key;
    private int value;
    
    Pair(String key,int value){
        this.key=key;
        this.value=value;
    }
    
    String getString(){
        return key;
    }
    
    int getValue(){
        return value;
    }
    
   
    
    
    
}

class PairComparator implements Comparator<Pair>{
    
     public int compare(Pair a,Pair b){
        if(a.getValue()>b.getValue()){
            return -1;
        }else if(a.getValue()<b.getValue()){
            return 1;
        }else if(a.getValue()==b.getValue()){
          Solution obj=new Solution();  
          return obj.check(a.getString(),b.getString());
        }
        return 0;
    }
} 

class Solution {
    
    int check(String a,String b){
        if(a.compareTo(b)>0){
            return 1;
        }else if(a.compareTo(b)<0){
            return -1;
        }
        return 0;
    }
    
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(new PairComparator());
        Map<String,Integer> hm=new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            String word=words[i];
            hm.put(word,hm.getOrDefault(word,0)+1);
            
        }
        
        for(Map.Entry<String,Integer> e:hm.entrySet()){
            pq.add(new Pair(e.getKey(),e.getValue()));
        }
        
        while(pq.size()>0){
            if(k==0){
                break;
            }
            Pair temp=pq.poll();
            ans.add(temp.getString());
            k--;
        }
       
        
        return ans;
    }
}