class Solution {
    public int networkDelayTime(int[][] times, int n, int K) {
        Map<Integer,List<int[]>> adjust=new HashMap<>();
       
        for(int[] time: times){
               adjust.computeIfAbsent(time[0],k->new ArrayList<>()).add(new int[]{time[1],time[2]});
           }
        
        Map<Integer,Integer> dist=new HashMap<>();
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((edge1,edge2) -> { 
            return  edge1[1]-edge2[1];
         });
         
        minHeap.offer(new int[]{K,0});
           
        while(!minHeap.isEmpty()){
           int[] curr=minHeap.poll();
           if(dist.containsKey(curr[0])) continue;
           dist.put(curr[0],curr[1]);
           
            if(adjust.containsKey(curr[0])){
                 for(int[] edge:adjust.get(curr[0])){
                       minHeap.offer(new int[]{edge[0],edge[1]+curr[1]});
                 }
                 }
           }
        if(dist.size()!=n) return -1;
        int res=Integer.MIN_VALUE;
        for(int k:dist.keySet()){
             res=Math.max(res,dist.get(k));
         }
     return res;
        
    }
}