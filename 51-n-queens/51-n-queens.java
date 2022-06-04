/* Recursive Solution
class Solution {
    public List<List<String>> solveNQueens(int n) {
      List<List<String>> res=new ArrayList<List<String>>();
        
        char[][] board=new char[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        
        dfs(0,board,res);
        
        return res;
        
    }
    
    private void dfs(int col,char[][] board,List<List<String>> res){
      
         if(col==board.length){
                   res.add(construct(board));
               return;}        

        for(int row=0;row<board.length;row++){
                  if(isValid(row,col,board)){
                      board[row][col]='Q';
                      dfs(col+1,board,res);
                      board[row][col]='.';
                     }
               }
    }
    
    private boolean isValid(int row,int col,char[][] board){
         int dumrow=row;
        int dumcol=col;
      
        while(row>=0&&col>=0){
              if(board[row][col]=='Q') return false;
                row--; col--;
               }

             row=dumrow;
            col=dumcol;
                 while(col>=0){
              if(board[row][col]=='Q') return false;
                col--;
               }
        
             row=dumrow;
            col=dumcol;
                 while(col>=0 && row<board.length){
              if(board[row][col]=='Q') return false;
                col--;
                row++;
               }

     return true;
    }

    private List<String> construct(char[][] board){
       List<String> res=new LinkedList<String> ();
       for(int i=0;i<board.length;i++){
         String s=new String(board[i]);
         res.add(s);
         }
 return res;
     }
}*/

class Solution {
    public List<List<String>> solveNQueens(int n) {
      List<List<String>> res=new ArrayList<List<String>>();
        
        char[][] board=new char[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        
        int leftRow[]=new int[n];
        int upperDiagonal[]=new int[2*n-1];
        int lowerDiagonal[]=new int[2*n-1];
        dfs(0,board,res,leftRow,upperDiagonal,lowerDiagonal);
        
        return res;
        
    }
    
    private void dfs(int col,char[][] board,List<List<String>> res, int leftRow[], int upperDiagonal[],int lowerDiagonal[]){
      
         if(col==board.length){
                   res.add(construct(board));
               return;}        

        for(int row=0;row<board.length;row++){
                  if(leftRow[row]==0 && upperDiagonal[board.length-1+col-row]==0 && lowerDiagonal[row+col]==0){
                      board[row][col]='Q';
                      leftRow[row]=1;
                      upperDiagonal[board.length-1+col-row]=1;
                      lowerDiagonal[col+row]=1;
                      dfs(col+1,board,res,leftRow,upperDiagonal,lowerDiagonal);
                       board[row][col]='.';
                      leftRow[row]=0;
                      upperDiagonal[board.length-1+col-row]=0;
                      lowerDiagonal[col+row]=0;
                     }
               }
    }
    
    

    private List<String> construct(char[][] board){
       List<String> res=new LinkedList<String> ();
       for(int i=0;i<board.length;i++){
         String s=new String(board[i]);
         res.add(s);
         }
 return res;
     }
}