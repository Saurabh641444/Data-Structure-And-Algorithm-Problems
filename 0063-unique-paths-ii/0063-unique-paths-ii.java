class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        
         int prev[]=new int[n];
        
        
        for(int i=0;i<m;i++){
            int[] temp=new int[n];
            
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    if(obstacleGrid[i][j]==0){
                        temp[j]=1;
                    }else{
                        temp[j]=0;
                    }
                }else if(obstacleGrid[i][j]==1){
                    temp[j]=0;
                }
                else{
                            int up=0;
                            int left=0;
                   up=prev[j];
                   if(j>0) left=temp[j-1]; 
                   temp[j]=up+left;
                }
            }
            prev=temp;
        }
        
        return prev[n-1];
        
        
       /* int dp[][]=new int[m][n];
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    if(obstacleGrid[i][j]==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=0;
                    }
                }else if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }
                else{
                            int up=0;
                            int left=0;
                  if(i>0) up=dp[i-1][j];
                   if(j>0) left=dp[i][j-1]; 
                   dp[i][j]=up+left;
                }
            }
        }
        
        return dp[m-1][n-1];*/
        // for(int [] a:dp){
        //     Arrays.fill(a,-1);
        // }
        // return solve(obstacleGrid,m-1,n-1,dp);
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