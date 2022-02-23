class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ri=0;
        int [] r= new int[n-k+1];
        
        // store index
        
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            // remove index out of range k
            if(!q.isEmpty() && q.peek()==(i-k)){q.poll();}
            
            //remove smaller numbers in the k range as they are useless
            
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[i]){ q.pollLast();}
            q.offer(i);
            
            if(i>=k-1){
                r[ri++]=nums[q.peek()];
            }
            
        }
        
        return r;
        
    }
}