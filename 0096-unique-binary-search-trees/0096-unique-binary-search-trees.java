class Solution {
    public int numTrees(int n) {
        int[][] dp=new int[n+1][n+1];
        
        for(int []a:dp) Arrays.fill(a,-1);
        
        return dfs(1,n,dp);
    }
    
    private int dfs(int start,int end,int[][] dp){
        if(start>=end) return 1;
        
        if(dp[start][end]!=-1) return dp[start][end];
        
        int ans=0;
        for(int i=start;i<=end;i++){
            ans+=dfs(start,i-1,dp)*dfs(i+1,end,dp);
        }
        
        return dp[start][end]=ans;
    }
}