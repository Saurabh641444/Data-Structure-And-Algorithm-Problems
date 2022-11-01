class Solution {
    public int[] findBall(int[][] grid) {
        int[] res=new int[grid[0].length];
        
        for(int i=0;i<grid[0].length;i++){
            
            res[i]=dfs(0,i,grid);
        }
        return res;
    }
    
    private int dfs(int row,int col, int[][] grid){
        
        if(row==grid.length) return col;
        
        int nextCol=col+grid[row][col];
        
        if(nextCol<0 || nextCol>grid[0].length-1 || grid[row][col]!=grid[row][nextCol]){
             return -1;
            
        }
        
        return dfs(row+1,nextCol,grid);
    }
}