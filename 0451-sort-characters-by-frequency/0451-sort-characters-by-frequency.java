class Solution {
    /*public String frequencySort(String s) {
       
       HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        
//         PriorityQueue<Pair> pq=new PriorityQueue<>(new sortComparator());
        
//         for(Map.Entry<Character,Integer> e:hm.entrySet()){
//             pq.add(new Pair(e.getKey(),e.getValue()));
//         }
        
//         String ans="";
        
//         while(pq.size()>0){
//         Pair temp=pq.poll();
//         char ch=temp.getKey();
//         int k=temp.getVal();
//         while(k-->0){
//             ans=ans+""+ch;
//         }
//         }
        
//         return ans;
        
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        
        for(char c:hm.keySet()){
            pq.add(c);
        }
        String ans="";
        while(pq.size()>0){
            char ch=pq.poll();
            int k=hm.get(ch);
            
            while(k-->0){
                ans=ans+""+ch;
            }
        }
        return ans;
    }*/
    
    class Pair{
        char ch;
        int val;
        
        Pair(char ch){
            this.ch=ch;
        }
        
        Pair(char ch,int val){
            this.ch=ch;
            this.val=val;
        }
    }
    
     public String frequencySort(String s) {
       Pair[] bucket=new Pair[123];
         
         for(int i=0;i<123;i++){
             bucket[i]=new Pair((char)i);
         }
     
         for(char ch:s.toCharArray()){
             bucket[ch].val+=1;
         }
         
         Arrays.sort(bucket,(a,b)->b.val-a.val);
         
         StringBuilder ans=new StringBuilder();
         
         for(Pair temp:bucket){
             char ch=temp.ch;
             int k=temp.val;
             
             while(k-->0) ans.append(""+ch+"");
         }
         
         return ans.toString();
    }
}

// class Pair{
//     char key;
//     int val;
    
//    Pair(char key,int val){
//        this.key=key;
//        this.val=val;
//    }
    
//     int getVal(){
//         return val;
//     }
    
//     char getKey(){
//         return key;
//     }
// }

// class sortComparator implements Comparator<Pair>{
    
//     public int compare(Pair a,Pair b){
//         if(a.getVal()>b.getVal()){
//             return -1;
//         }else if(a.getVal()<b.getVal()){
//             return 1;
//         }
//         return 0;
//     }
// }