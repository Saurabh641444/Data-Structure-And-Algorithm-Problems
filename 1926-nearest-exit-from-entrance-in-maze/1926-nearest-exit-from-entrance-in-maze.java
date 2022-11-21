class Solution {
    int min=Integer.MAX_VALUE;
    public int nearestExit(char[][] maze, int[] entrance) {
       /*
       + do not go
       . you can go
       e- entrance
       */
       
        int m=maze.length;
        int n=maze[0].length;
       
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        
        int x=entrance[0];
        int y=entrance[1];
        
        maze[x][y]='+';
        
        Queue<int[]> q=new LinkedList<>();
        
        q.add(new int[]{x,y,0});
        
        while(!q.isEmpty()){
            int [] curr=q.poll();
            
            int row=curr[0];
            int col=curr[1];
            int dist=curr[2];
            
            for(int[] d:dir){
                int new_row=row+d[0];
                int new_col=col+d[1];
                int new_dist=dist;
                
                if(0<=new_row && 0<=new_col && new_row<m && new_col<n && maze[new_row][new_col]=='.'){
                 if(new_row==0 || new_row==m-1 || new_col==0 || new_col==n-1)  {
                     return new_dist+1;
                 } 
                    maze[new_row][new_col]='+';
                    q.add(new int[]{new_row,new_col,new_dist+1});
                }
            }
        }
        
       return -1; 
    }
    
 
}