//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        // your code here
        int mod=1_000_000_007;
        int dp[]=new int[n+1];
        // dp[0]=1;
        // dp[1]=1;
        
        // for(int i=2;i<=n;i++){
        //     dp[i]=(dp[i-1]+dp[i-2])%mod;
        // }
        // return dp[n]%mod;
        
        int prev2=1;
        int prev=1;
        
        for(int i=2;i<=n;i++){
            int curr=(prev+prev2)%mod;
           
            prev2=prev;
             prev=curr;
        }
        return prev%mod;
    }
    
    int solve(int n,int mod){
        
        if(n<=1) return 1;
        
        int left=solve(n-1,mod)%mod;
        int right=solve(n-2,mod)%mod;
        
        return (left+right)%mod;
    }
}

