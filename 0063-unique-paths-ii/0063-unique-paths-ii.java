class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        return solve(obstacleGrid,m-1,n-1,dp);
    }
    
    private int solve(int[][] arr,int i,int j,int [][] dp){
        
        if(i==0 && j==0) {
            if(arr[i][j]==0) return 1;
            else return 0;
        }
        
        if(i<0 || j<0) return 0;
        
        if(arr[i][j]==1) return 0;
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        int up=solve(arr,i-1,j,dp);
        int left=solve(arr,i,j-1,dp);
        
        return dp[i][j]=up+left;
    }
}