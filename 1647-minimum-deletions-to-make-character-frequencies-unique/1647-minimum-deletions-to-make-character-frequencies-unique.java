class Solution {
    public int minDeletions(String s) {
        int count=0;
        Map<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            pq.add(entry.getValue());
        }
        
        while(pq.size()>0){
      int most_frequent=pq.poll();
      if(pq.size()==0){
          return count;
        }

        if(most_frequent==pq.peek()){
                   if(most_frequent>1){ pq.add(most_frequent-1);}
             count++;
           }
           }

      return count;
        
    }
}