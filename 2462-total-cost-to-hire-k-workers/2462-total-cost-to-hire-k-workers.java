class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long ans=0L;
        int round=0;
        
        int l=0;
        int r=costs.length-1;
        int n=costs.length;
        
        PriorityQueue<Integer> left=new PriorityQueue<>();
        
        PriorityQueue<Integer> right=new PriorityQueue<>();
        
        for(;l<candidates;l++) left.add(costs[l]);
        
        for(;r>=n-candidates && r>=l;r--) right.add(costs[r]);
        
        while(l<=r && round<k){
            
            if(left.peek()<=right.peek()){
                ans+=left.poll();
                left.add(costs[l]);
                l++;
            }else{
                ans+=right.poll();
                right.add(costs[r]);
                r--;
            }
            
            round++;
        }
        
        while(round<k){
            if(left.size()==0){
                ans+=right.poll();
            }else if(right.size()==0){
                ans+=left.poll();
            }else if(left.peek()<=right.peek()){
                ans+=left.poll();
            }else{
                ans+=right.poll();
            }
            
            round++;
        }
        
        return ans;
    }
}