class Solution {
    private int mod=(int)Math.pow(10,9)+7;
    public int numRollsToTarget(int n, int k, int target) {
        
        int dp[][]=new int[n+1][target+1];
        
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        
        return numRollsToTarget(n,k,target,dp);
        
    }
    
    private int numRollsToTarget(int n, int k, int target,int [][] dp) {
        
        if(target==0 && n==0) return 1;
        
        if(target<0 || n==0) return 0;
        
        if(dp[n][target]!=-1){
            return dp[n][target];
        }
        
        int count=0;
        
        for(int i=1;i<=k;i++){
            
            count=(count+numRollsToTarget(n-1,k,target-i,dp)%mod)%mod;
        }
        
        return dp[n][target]=count;
    }
    
}