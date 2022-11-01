class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;
        
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        
       return solve(nums,n-1,dp);
    }
    
    private int solve(int [] nums,int n,int[] dp){
        
        if(n==0){
            return nums[0];
        }
        
        if(n<0) return 0;
        
        if(dp[n]!=-1) return dp[n];
        
        int pick=nums[n]+solve(nums,n-2,dp);
        int notpick=solve(nums,n-1,dp);
        
        return dp[n]=Math.max(pick,notpick);
    }
}