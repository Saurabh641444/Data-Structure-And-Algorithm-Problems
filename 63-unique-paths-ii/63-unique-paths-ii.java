class Solution {
    int[][] t;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        t=new int[obstacleGrid.length][obstacleGrid[0].length];
        
        for(int[] d:t){
            Arrays.fill(d,-1);
        }
        
        return dfs(obstacleGrid,0,0);
    }
    
    int dfs(int [] []grid,int row, int col){
        if(col<0||row<0||row==grid.length||col==grid[0].length|| grid[row][col]==1){
            return 0;
        }
        
        if(row==grid.length-1 && col==grid[0].length-1){
            return 1;
        }
        
        if(t[row][col]!=-1){ return t[row][col];}
        
        t[row][col]=dfs(grid,row+1,col)+dfs(grid,row,col+1);
        
        return t[row][col];
        
    }
}