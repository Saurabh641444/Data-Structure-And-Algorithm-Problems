class Solution {
    int count=0;
    int dp[][][];
    public int numberOfPaths(int[][] grid, int k) {
        
        dp=new int[grid.length+1][grid[0].length+1][50];
        
        for(int arr[][]:dp){
           for(int a[]:arr){
               Arrays.fill(a,-1);
           }
        }
        
       return  dfs(grid,k,0,0,0);
       
    }
    
    public int dfs(int[][] grid,int k,int sum,int i,int j){
    
        
        if(i<0 || j<0 || i==grid.length || j==grid[0].length) {
          
            return 0;
        }
        
       
        
        sum+=grid[i][j];
       
        if(i==grid.length-1 && j==grid[0].length-1){
              if(sum%k==0){
               return 1;
              }else{
                  return 0;
              }
          }
        
        
        if( dp[i][j][sum%k]!=-1){
            return  dp[i][j][sum%k];
        }
        
        dp[i][j][sum%k]=(dfs(grid,k,sum,i+1,j)+dfs(grid,k,sum,i,j+1))%1000000007;
     
       
        
        return  dp[i][j][sum%k];
    }
}