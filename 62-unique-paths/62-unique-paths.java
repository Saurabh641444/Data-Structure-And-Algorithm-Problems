/* Recurssion solution*/
// class Solution {
//     public int uniquePaths(int m, int n) {
//         return helper(0,m-1,n-1);
//     }

//     public static int helper(int count,int m, int n){
//       if(n==0){
//        count++; 
//        return count;
//         }
//        if(m==0){
//        count++; 
//        return count;
//         }
//      if(m>0){
//       count=helper(count,m-1,n);
//         }
//        if(n>0){
//       count=helper(count,m,n-1);
//         }
//     return count;
//       }
// }

/*Memoization*/

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] memo=new int[m][n];
        return helper(memo,m-1,n-1);
    }

    public static int helper(int[][] memo,int m, int n){
      if(n==0){ 
       return 1;
        }
       if(m==0){
       return 1;
        }
       if(memo[m][n] != 0){ 
         return memo[m][n];}
    
      int path1=helper(memo,m-1,n);
      int path2=helper(memo,m,n-1);
      memo[m][n]=path1+path2;
      return path1+path2;      

      }
}