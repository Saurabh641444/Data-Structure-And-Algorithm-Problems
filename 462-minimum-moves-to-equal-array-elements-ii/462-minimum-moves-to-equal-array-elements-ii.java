class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        
        int target=nums[nums.length/2];
        int res=0;
        for(int num:nums){
            res+=Math.abs(target-num);
        }
        
        return res;
    }
}