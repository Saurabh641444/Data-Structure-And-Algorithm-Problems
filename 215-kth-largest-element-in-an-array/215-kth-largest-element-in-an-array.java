/*class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}*/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(k+1);
        for(int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
           
        }
        
        
        return pq.poll();
    }
}