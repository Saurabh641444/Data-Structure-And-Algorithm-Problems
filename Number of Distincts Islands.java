//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java


class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        HashSet<ArrayList<String>> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(vis[i][j]==false && grid[i][j]==1){
                   ArrayList<String> vec=new ArrayList<>();
                   dfs(i,j,vis,grid,vec,i,j);
                   set.add(vec);
               }      
            }
        }
        
        return set.size();
    }
    
    void dfs(int row,int col, boolean[][] vis,int grid[][],ArrayList<String> vec ,int row0 ,int col0) {
         
         vis[row][col]=true;
         
         vec.add(toString(row-row0,col-col0));
         
         int[] delRow={-1,0,1,0};
         int[] delCol={0,1,0,-1};
         
         int n=grid.length;
         int m=grid[0].length;
         
         for(int i=0;i<4;i++){
             
             int curr_row=row+delRow[i];
             int curr_col=col+delCol[i];
             
             if(curr_row>=0 && curr_row<n && curr_col>=0 && curr_col<m && vis[curr_row][curr_col]==false  && grid[curr_row][curr_col]==1){
                  dfs(curr_row,curr_col,vis,grid,vec,row0,col0);              
             }
             
         }
        
    }
    
    String toString(int row,int col){
        return Integer.toString(row)+" "+Integer.toString(col);
    }
}
