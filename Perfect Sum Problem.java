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
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
/*	    int [][]dp=new int[n+1][sum+1];
	    
	   // for(int a[]:dp){
	   //   Arrays.fill(a,-1);    
	   // }
	    
	   // return perfectSumHelper(arr,n-1,sum,dp);
	   
	   for(int i=0;i<n+1;i++){
	       dp[i][0]=1;
	   }
	   
	   for(int i=1;i<=sum;i++){
	       dp[0][i]=0;
	   }
	   
	   for(int i=1;i<n+1;i++){
	       for(int j=0;j<=sum;j++){
	           int notPick=dp[i-1][j];
	           int pick=0;
	           if(arr[i-1]<=j){
	               pick=dp[i-1][j-arr[i-1]];
	          }
	    
	    
	        dp[i][j]=(pick+notPick)%1000000007;
	       }
	   }
	   
	   return dp[n][sum];*/
	   
	   int[] prev=new int[sum+1];
	   
	   prev[0]=1; 
	   
	   for(int i=1;i<n+1;i++){
	       int[] curr=new int[sum+1];
	       curr[0]=1;
	       for(int j=0;j<=sum;j++){
	           int notPick=prev[j];
	           int pick=0;
	           if(arr[i-1]<=j){
	               pick=prev[j-arr[i-1]];
	          }
	    
	    
	        curr[j]=(pick+notPick)%1000000007;
	       }
	       prev=curr.clone();
	   }
	   
	   return prev[sum];
	   
	} 
	
	private int perfectSumHelper(int [] arr,int n,int target,int[][] dp){
	    
	    
	   // if(0==target) return 1;
	   
	    if(n==0){
	        if(target==0 && arr[0]==0){
	            return 2;
	        }
	        
	        if(target==0 || target==arr[0]) return 1;
	        
	        return 0;
	    }
	    
	    if(dp[n][target]!=-1) return dp[n][target];
	    int notPick=perfectSumHelper(arr,n-1,target,dp);
	    int pick=0;
	    if(arr[n]<=target){
	          pick=perfectSumHelper(arr,n-1,target-arr[n],dp);
	    }
	    
	    
	    return dp[n][target]=(pick+notPick)%1000000007;
	}
}
