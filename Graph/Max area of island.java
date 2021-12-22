class Solution {
    int max=0,maxNow=0;
    public int maxAreaOfIsland(int[][] grid) {
          if(grid.length==0){
          return 0;
             }
     
     int r=grid.length;
     int c=grid[0].length;
     for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
           if(grid[i][j]==1){
            maxNow=0;      
            DFS(grid,i,j);
               

                 }
             }
        }
         return max;
    }
    
    private  void DFS(int grid[][],int i,int j){
    int r=grid.length;
    int c=grid[0].length;

    if(i<0|| j<0  || i>=r || j>=c || grid[i][j]!=1){
         return;
             }
				 grid[i][j]=-1;
        maxNow++;
				DFS(grid,i+1,j);
				DFS(grid,i,j+1);
				DFS(grid,i-1,j);
				DFS(grid,i,j-1);
        max=Math.max(max,maxNow);
     }
}
