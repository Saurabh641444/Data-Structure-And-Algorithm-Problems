class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int min=Integer.MAX_VALUE;
        int[][] dp=new int[m][n];
        
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return dfs(grid,m-1,n-1,min,0,dp);
        
    }
    
    private int dfs(int [][] grid,int i,int j,int min,int path,int[][] dp){
        
        if(i==0 && j==0){
           
            return grid[0][0];
        }
        
        if(i<0 || j<0) return Integer.MAX_VALUE;
        
        if(dp[i][j]!=-1) return dp[i][j];
       
        int up= dfs(grid,i-1,j,min,path,dp);
        
         int left =dfs(grid,i,j-1,min,path,dp);
        
       
       min =(grid[i][j]+Math.min(up,left));
         // System.out.println(min);
        return dp[i][j]=min ;
    }
}