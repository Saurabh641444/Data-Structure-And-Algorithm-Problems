class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maximum=nums[0];
        
        for(int num:nums){
            sum+=num;
               maximum=Math.max(sum,maximum);
        
        if(sum<0){sum=0;}
        }
     
        return maximum;
    }
}