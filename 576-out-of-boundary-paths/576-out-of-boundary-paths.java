class Solution {
    int M=1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
        int arr[][][]=new int[m][n][maxMove+1];
        
        for(int num[][]:arr){
            for(int[] s:num){
            Arrays.fill(s,-1);
            }
        }
        return dfs(m,n,maxMove,startRow,startColumn,arr);
    }
    
    
    private int dfs(int m,int n,int N,int i,int j, int[][][] arr){
        
        
        
        if(i==m || j==n || i<0 || j<0) return 1;
        if(N==0) return 0;
        if(arr[i][j][N]>=0) return arr[i][j][N];
        
        arr[i][j][N]=(
            (dfs(m,n,N-1,i-1,j,arr)+dfs(m,n,N-1,i+1,j,arr))%M+
            (dfs(m,n,N-1,i,j-1,arr)+dfs(m,n,N-1,i,j+1,arr))%M
            )%M;
        
        return arr[i][j][N];
    }
}