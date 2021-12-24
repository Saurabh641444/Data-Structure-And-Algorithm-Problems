class Cell{
int x,y;
   
 Cell(int x,int y){
     this.x=x;
     this.y=y;
    }
}

class Solution{
   //bfs
       int n,m;
    public int numIslands(char[][] grid){
     n=grid.length;
     m=grid[0].length;
    
    int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
    int ans=0;
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
       if(grid[i][j]=='1'){
          
         Queue<Cell> q=new LinkedList<Cell>();
         q.add(new Cell(i,j));

         while(!q.isEmpty()){
           Cell temp=q.peek();
           q.remove();
           
          for(int k=0;k<4;k++){
             int x=temp.x+dir[k][0];

             int y=temp.y+dir[k][1];

             if(x<0||y<0||x>=n||y>=m||grid[x][y]=='0') continue;
            
             grid[x][y]='0';
             q.add(new Cell(x,y));
       }

              }
     ans++;
            }
        }

     }
 return ans;

      }



    }
