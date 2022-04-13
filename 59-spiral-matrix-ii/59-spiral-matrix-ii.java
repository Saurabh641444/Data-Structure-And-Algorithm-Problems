class Solution {
    public int[][] generateMatrix(int n) {
       int[][] ans=new int[n][n];
       int c=1;
      int row=0,re=n-1,col=0,ce=n-1;
   
       while(row<=re && col<=ce){
                
            for(int i=col;i<=ce;i++){
                  ans[row][i]=c++;
                   }
             row++;
             for(int i=row;i<=re;i++){
                  ans[i][ce]=c++;
                   }
             ce--;
              for(int i=ce;i>=col;i--){
                 ans[re][i]=c++;
                   }
               re--;
              for(int i=re;i>=row;i--){
                ans[i][col]=c++;
               }
              col++;
          }
       return ans;
    }
}