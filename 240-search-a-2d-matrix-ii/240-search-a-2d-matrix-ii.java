/*class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m=matrix.length;
       int n=matrix[0].length;
        
       for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              if(matrix[i][j]==target){
                  return true;
              }
          } 
       } 
        
        return false;
    }
}*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m=matrix.length;
       int n=matrix[0].length;
        
         int i=0;
         int j=n-1;
          
         while(j>=0 && i<m){
             if(matrix[i][j]==target) return true;
             else if(matrix[i][j]<target) i++;
             else j--;
         }
        
        return false;
    }
}