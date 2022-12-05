//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(St[0]);
            int m = Integer.parseInt(St[1]);
            int k = Integer.parseInt(St[2]);
            
            int[][] mat = new int[n][m];
            
            for(int i=0; i<n; i++)
            {
                String S[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                    mat[i][j] = Integer.parseInt(S[j]);
            }

            Solution ob = new Solution();
            System.out.println(ob.shotestPath(mat,n,m,k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public static final int[] dirX={-1,1,0,0};
    public static final int[] dirY={0,0,-1,1};
    public static final int DIRS=4;
    
    static int shotestPath(int[][] mat, int n, int m, int k) {
        // code here
        boolean vis[][][]=new boolean[n][m][k+1];
        Queue<int[]> q=new LinkedList<>();
        
        q.add(new int[]{0,0,0,k});
        vis[0][0][k]=true;
        
        while(!q.isEmpty()){
            int[] curr=q.poll();
            
            if(curr[0]==n-1 && curr[1]==m-1){
                return curr[2];
            }
            
            for(int dir=0;dir<DIRS;dir++){
                int newX=curr[0]+dirX[dir];
                int newY=curr[1]+dirY[dir];
                int newK=curr[3];
                
                if(!isSafe(newX,newY,n,m)) continue;
                
                if(mat[newX][newY]==0 && !vis[newX][newY][newK]){
                    q.add(new int[]{newX,newY,curr[2]+1,newK});
                    vis[newX][newY][newK]=true;
                }else if(newK >0 && !vis[newX][newY][newK-1]){
                    q.add(new int[]{newX,newY,curr[2]+1,newK-1});
                    vis[newX][newY][newK-1]=true;
                }
            }
        }
        return -1;
    }
    
    static boolean isSafe(int x,int y,int n,int m){
        return (x>=0 && x<n && y>=0 && y<m);
    }
};
