//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int maxCoins(int N, int[] nums) {

    // code here

     int [][]dp = new int[nums.length][nums.length] ;

        for(int g = 0  ;g<dp.length ;g++)

        {

            for(int i = 0,j = g ;j<dp.length; j++,i++)

            {

                int mx = Integer.MIN_VALUE ;

                for(int k = i ;k<=j;k++)

                {

                    int l = k==i?0:dp[i][k-1] ;

                    int r = k==j?0:dp[k+1][j] ;

                    int val = (i==0?1:nums[i-1] )* nums[k] *( j== nums.length-1 ? 1: nums[j+1]) ;

                    int sum = l+r+val ;

                    if(sum>mx)

                    mx= sum ;

                }

                dp[i][j]= mx ;

            }

            

        }

        return dp[0][nums.length-1] ;

    }
}
     
