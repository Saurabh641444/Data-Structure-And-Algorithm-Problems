class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;

        int num=0;
        int r=grid.length;
        int c=grid[0].length;

        for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
               if(grid[i][j]=='1'){
                       dfs(grid,i,j);
                        num++;
                     }  
             }
          }
      return num;
    }

    private  void dfs(char[] [] grid,int i,int j){
       int r=grid.length;
       int c=grid[0].length;

       if(i<0 || i>=r || j<0 || j>=c || grid[i][j]=='0'){ return ;}      
        grid[i][j]='0';
       dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        } 
    
}