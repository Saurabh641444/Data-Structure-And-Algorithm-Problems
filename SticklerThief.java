//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        
        return maxLoot(arr,n-1,dp);
        
        
        
    }
    
    private int maxLoot(int arr[],int n,int[] dp){
        
        if(n<0) { return 0;}
        
        if(n==0){
            return arr[0];
        }
        
        if(dp[n]!=-1) return dp[n];
        
        
        int pick=arr[n]+maxLoot(arr,n-2,dp);
        
        int notpick=maxLoot(arr,n-1,dp);
        
        return dp[n]=Math.max(pick,notpick);
    }
}
