class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[0]-b[0]));
        
        for(int i=0;i<nums.length;i++){
            pq.offer(new int[]{nums[i],i});
            
            while(pq.size()>k){
                pq.remove();
            }  
        }
        
        HashSet<Integer> set=new HashSet<>();
        
        while(!pq.isEmpty()){
            int [] arr=pq.poll();
            set.add(arr[1]);
        }
        
        int ans[]=new int[k];
        
        int z=0;
        
        for(int i=0;i<nums.length;i++){
            if(set.contains(i)){
                ans[z++]=nums[i];
            }
        }
        
        return ans;
    }
}