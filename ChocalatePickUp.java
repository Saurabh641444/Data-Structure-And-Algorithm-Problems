import java.util.* ;
import java.io.*; 
public class Solution {
    public static int maximumChocolates(int r, int c, int[][] grid) {
        // Write your code here.
        int dp[][][]=new int[r][c][c];
        
        for(int [][] a:dp){
            for(int [] b:a){
                Arrays.fill(b,-1);
            }
        }
        return helper(grid,r,c,0,0,c-1,dp);
    }
    
    public static int helper(int[][] arr,int n,int m,int i,int j1,int j2,int[][][] dp){
        
        if(j1<0 || j1>=m || j2<0 || j2>=m){
            return (int)Math.pow(-10,9);
        }
        
        if(i==n-1){
            if(j1==j2){
                return arr[i][j1];
            }else{
                return arr[i][j1]+arr[i][j2];
            }
        }
        
        if(dp[i][j1][j2]!=-1) return dp[i][j1][j2];
        
            int max=Integer.MIN_VALUE;
            for(int di=-1;di<=1;di++){
                for(int dj=-1;dj<=1;dj++){
                    int ans;
                    if(j1==j2){
                        ans=arr[i][j1]+helper(arr,n,m,i+1,j1+di,j2+dj,dp);
                    }else{
                        ans=arr[i][j1]+arr[i][j2]+helper(arr,n,m,i+1,j1+di,j2+dj,dp);
                    }
                    max=Math.max(ans,max);
                }
            }
            
        
       return dp[i][j1][j2]=max; 
    }
    
    
 }
