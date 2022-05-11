// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
   
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<>();
         String path="";
        helper(0,0,m,n,ans,path);
        
        return ans;

    }

    private static void  helper(int row,int col,int m[][],int n,ArrayList<String> ans, String path){
         if(row<0 || row>=n || col<0 || col >=n || m[row][col]==0){
          return ;
           }
           
  	if(row==n-1 && col==n-1){
   	ans.add(path);
 	 return;
    	}
       
       m[row][col]=0;
       
       path+='U';
       helper(row-1,col,m,n,ans,path);
       path=path.substring(0,path.length()-1);
       
       path+='D';
       helper(row+1,col,m,n,ans,path);
       path=path.substring(0,path.length()-1);
       
       path+='L';
       helper(row,col-1,m,n,ans,path);   
       path=path.substring(0,path.length()-1);
       
       path+='R';
       helper(row,col+1,m,n,ans,path);   
       path=path.substring(0,path.length()-1);
       
        m[row][col]=1;
      
     }

    
}