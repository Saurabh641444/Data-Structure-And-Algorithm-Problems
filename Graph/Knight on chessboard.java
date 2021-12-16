class Cell{
int x,y;
   
Cell(int x,int y){
     this.x=x;
     this.y=y;
    }
}

public class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public int knight(int N, int M, int x1, int y1, int x2, int y2)
    {
       int[] dx={-1, -2, -1, -2, 1,   2, 1, 2};
       int[] dy={-2, -1,  2,  1, -2, -1, 2, 1};

      boolean isVisited[][]=new boolean[N+1][M+1];
      Queue<Cell> q=new LinkedList<Cell>();

      q.add(new Cell(x1,y1));
    isVisited[x1][y1]=true;
     int moveCount=0;
     
     while(q.isEmpty()==false){
       int size=q.size();

       for(int i=0;i<size;i++){
            Cell temp=q.remove();
            if(temp.x==x2 && temp.y==y2){
                          return moveCount;
             }
           
           for(int j=0;j<8;j++){
            
             if(isValid(temp.x+dx[j],temp.y+dy[j],N,M)
                            &&isVisited[temp.x+dx[j]][temp.y+dy[j]]==false){
                              q.add(new Cell(temp.x+dx[j],temp.y+dy[j]));
                             isVisited[temp.x+dx[j]][temp.y+dy[j]]=true;
                      }
         
               
              }
           }
        moveCount++;
       }
          return -1;
    }
   private boolean isValid(int x,int y,int N, int M){
        if(x<=0||y<=0||x>N||y>M){ return false;}
        return true;
     }
}
