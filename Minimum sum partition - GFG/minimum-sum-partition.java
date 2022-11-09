//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int TotalSum=0;
	    
	    for(int num:arr){
	        TotalSum+=num;
	    }
	    
	    boolean dp[][]=new boolean[n+1][TotalSum+1];
	    
	    for(int i=0;i<n;i++){
	        dp[i][0]=true;
	    }
	    
	    if(arr[0]<=TotalSum) dp[0][TotalSum]=true;
	    
	    for(int i=1;i<n;i++){
	        for(int j=0;j<TotalSum+1;j++){
	            
	            boolean notTake=dp[i-1][j];
	            boolean take=false;
	            
	            if(j>=arr[i]){
	                take=dp[i-1][j-arr[i]];
	            }
	            
	            dp[i][j]=take || notTake;
	        }
	    }
	    
	    int min=Integer.MAX_VALUE;
	    
	   for(int i=0;i<=TotalSum;i++){
	       if(dp[n-1][i]){
	           min=Math.min(min,Math.abs(i-(TotalSum-i)));
	       }
	   }
	    
	    return min;
	} 
}
