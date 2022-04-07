class Solution {
    public int lastStoneWeight(int[] stones) {
     PriorityQueue<Integer> pq=new  PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:stones){
            pq.add(i);
        }
        
        int x=0;
        int y=0;
        
        while(pq.size()>1){
            y=pq.poll();
            x=pq.poll();
            
            if(y>x){
                pq.offer(y-x);
            }
        }
        
        return pq.isEmpty()?0:pq.poll();
    }
}