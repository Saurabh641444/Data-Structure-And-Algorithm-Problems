class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int sum=0;
        int dp[]=new int[target+1];
        Arrays.fill(dp,-1);
        return helper(nums,target,dp);
    }
    
    private int helper(int[] nums,int target,int dp[]){
        
        if(0>target ) return 0;
        
        if(0==target) return 1;
        
        if(dp[target]!=-1) return dp[target];
        
        int count=0;
        
        for(int j=0;j<nums.length;j++){
         count+=  helper(nums,target-nums[j],dp);
        }
        dp[target]=count;
        
        return count;
    }
}