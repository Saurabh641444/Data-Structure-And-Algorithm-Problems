class Solution {
    
    public int[][] groupCodes;
    public int areaCalculatorForLarge;
    public int largestIsland(int[][] grid) {
        int result=0;
        int m=grid.length;
        int n=grid[0].length;
            
        GroupCodes=new int[m][n];
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,0);
        int code=-1;
        

        for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
               if(grid[i][j]==1){
                 areaCalculatorForLarge=0;
                  DFS(grid,i,j,code);
                  hm.put(code,areaCalculatorForLarge);
                  code=-1;
                   }
                 }
           }
      
        boolean hasZero=false;
        for(int i=0;i<m;i++){
           
          }
 
    }
      
    public void DFS(int[][] gid,int i,int j,int code){
     if(i<0||i>grid.length-1||j<0||j>grid[0].length-1|| groupCodes[i][j]!=0||grid[i][j]==0){ return;}
     
     areaCalculatorForLarge++;
     groupCodes[i][j]=code;

      DFS(grid,i+1,j,code);
      DFS(grid,i,j+1,code);
      DFS(grid,i-1,j,code);
      DFS(grid,i,j-1,code);
      return;
       }


}
