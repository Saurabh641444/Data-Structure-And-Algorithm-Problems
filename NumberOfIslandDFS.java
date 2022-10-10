//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    
    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        //Your code here
        List<Integer> ans=new ArrayList<>();
        
        int grid[][]=new int[rows][cols];
        
        for(int i=0;i<operators.length;i++){
            int r=operators[i][0];
            int c=operators[i][1];
            
            grid[r][c]=1;
            
            ans.add(helper(grid,rows,cols));
        }
        
        return ans;
    }
    
    public int helper(int grid[][], int rows, int cols){
        int count=0;
        boolean vis[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                    dfs(grid,i,j,vis,rows,cols);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void dfs(int [][] grid,int i,int j,boolean[][] vis,int m,int n){
        
        vis[i][j]=true;
        
        int x[]={0,1, 0,-1};
        int y[]={1,0,-1, 0};
        
        for(int k=0;k<4;k++){
            
            int new_x=i+x[k];
            int new_y=j+y[k];
            
            if(new_x>=0 && new_y>=0 && new_x<m && new_y<n && vis[new_x][new_y]==false && grid[new_x][new_y]==1){
                dfs(grid,new_x,new_y,vis,m,n);
            }
        }
        
    }
    
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int  k= sc.nextInt();
            int[][] a = new int[k][2];
            for(int i=0;i<k;i++){
            
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            List<Integer> ans = obj.numOfIslands(n,m,a);
           
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends
