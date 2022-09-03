//{ Driver Code Starts
// Initial Template for Java

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
            int ans = ob.numberOfEnclaves(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Pair{
    
    int first;
    int second;
    
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
    
}

class Solution {

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        Queue<Pair> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        int[][] vis=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
            if(i==0 || j==0 || i==m-1|| j==n-1){
                 
                 if(grid[i][j]==1){
                     
                     q.add(new Pair(i,j));
                     vis[i][j]=1;
                 }
                
               }    
                
            }
        }
        
        int [] x={-1,0,1,0};
        int [] y={0,1,0,-1};
        
        while(!q.isEmpty()){
            Pair temp=q.poll();
            
            int row=temp.first;
            int col=temp.second;
            
            for(int i=0;i<4;i++){
                int curr_row=row+x[i];
                int curr_col=col+y[i];
                
                if(curr_row>=0 && curr_row<m && curr_col>=0 && curr_col<n && 
                vis[curr_row][curr_col]==0 && grid[curr_row][curr_col]==1){
                    q.add(new Pair(curr_row,curr_col));
                    vis[curr_row][curr_col]=1;
                }
            }
            
        }
        
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    count++;
                }
            }
        }
        
        return count;
        
    }
}
