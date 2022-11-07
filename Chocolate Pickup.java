import java.util.* ;
import java.io.*; 
public class Solution {
    public static int maximumChocolates(int r, int c, int[][] grid) {
        // Write your code here.
        int dp[][][]=new int[r][c][c];
        
        for(int j1=0;j1<c;j1++){
            for(int j2=0;j2<c;j2++){
              if(j1==j2){
                  dp[r-1][j1][j2]=grid[r-1][j2];
              }else{
                  dp[r-1][j1][j2]=grid[r-1][j1]+grid[r-1][j2];
              }
            }
        }
        
        for(int i=r-2;i>=0;i--){
            for(int j1=0;j1<c;j1++){
                for(int j2=0;j2<c;j2++){
                    int max=Integer.MIN_VALUE;
                    
                        for(int di=-1;di<=1;di++){
                            for(int dj=-1;dj<=1;dj++){
                                int ans;
                                if(j1==j2){
                                 ans=grid[i][j1];
                                 }else {
                                  ans=grid[i][j1]+grid[i][j2];
                                   }
                                
                                 if ((j1 + di < 0 || j1 + di >= c) ||
                (j2 + dj < 0 || j2 + dj >= c))

                ans += (int) Math.pow(-10, 9);
              else
                ans += dp[i + 1][j1 + di][j2 + dj];
                                
                              max=Math.max(ans,max);
                              
                               }
                             }
                            dp[i][j1][j2]=max;
                           }
                         }
                       }
        return dp[0][0][c-1];
//         for(int [][] a:dp){
//             for(int [] b:a){
//                 Arrays.fill(b,-1);
//             }
//         }
//         return helper(grid,r,c,0,0,c-1,dp);
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
