class Solution {
  
    int[][] dirs={{1,0},{-1,0},{0,1},{0,-1}};
    int m,n;
    int max;

    public int getMaximumGold(int[][] grid) {
      m=grid.length;
      n=grid[0].length;
   
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
              if(grid[i][j]!=0){
                  dfs(grid,i,j,grid[i][j]);
               }
           }
       } 
        return max;
  
    }
   
   public void dfs(int[][] grid,int x,int y,int val){
       max=Math.max(max,val);

       int temp=grid[x][y];
       grid[x][y]=0;

       for(int [] dir:dirs){
           int xx=x+dir[0];
           int yy=y+dir[1];

          if(xx>=0 && xx<m && yy>=0 && yy<n&& grid[xx][yy]!=0){
                   dfs(grid,xx,yy,val+grid[xx][yy]);
           }
        }
     grid[x][y]=temp;
    }
   
}