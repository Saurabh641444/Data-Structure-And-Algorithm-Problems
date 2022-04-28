class Solution {
    public int minimumEffortPath(int[][] heights) {
        int l=0,r=1000001;
        while(l<r){
             int limit=(l+r)/2;
             if(good(heights,limit)){ r=limit;}
             else{l=limit+1;}
           }
        return l;
    }
    
    private boolean good(int[][] h,int limit){
     int R=h.length;
     int C=h[0].length;
      
     Queue<int[]> q=new LinkedList();
     boolean[][] visited=new boolean[R][C];
     visited[0][0]=true;
      q.add(new int[]{0,0});
       
       while(q.size()>0){
            int x=q.peek()[0];
            int y=q.peek()[1];
            q.poll();
             if(x==R -1 && y==C-1){
                  return true; 
                }
            int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
            for(int [] d:dir){
                  int nx=x+d[0];
                  int ny=y+d[1];
                  if(nx>=0 && nx<R && ny>=0 && ny<C && !visited[nx][ny]){
                        if(Math.abs(h[x][y]-h[nx][ny])<=limit){
                             q.add(new int[]{nx,ny});
                              visited[nx][ny]=true;
                             }
                         }
                      }
                }
         return false;
      }
}