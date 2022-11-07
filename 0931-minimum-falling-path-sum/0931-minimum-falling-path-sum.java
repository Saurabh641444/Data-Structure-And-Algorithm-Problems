class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int min=Integer.MAX_VALUE;
        int dp[][]=new int[n][n];
        
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        
        for(int i=0;i<matrix.length;i++){
         min=Math.min(min,dfs(matrix,n,0,i,Integer.MAX_VALUE,dp));
        }   
        
        return min;
    }
    
    private int dfs(int [][] arr,int n, int row,int col,int min,int dp[][]){
        
        if(row>=n || col>=n || col<0) return Integer.MAX_VALUE;
        
        if(row==n-1){
            return arr[row][col];
        }
        
        if(dp[row][col]!=-1)return dp[row][col];
        
        int left=dfs(arr,n,row+1,col-1,min,dp);
        int mid=dfs(arr,n,row+1,col,min,dp);
        int right=dfs(arr,n,row+1,col+1,min,dp);
        // System.out.println(left+" "+mid+" "+right);
        min=Math.min(min,arr[row][col]+Math.min(left,Math.min(right,mid)));
        return dp[row][col]=min;
    }
}