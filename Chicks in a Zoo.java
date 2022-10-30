//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            long ans = obj.NoOfChicks(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long NoOfChicks(int N)
    {
        // Code here
        long dp[]=new long[N+1];
        dp[1]=1;
        long total=1;
        
        for(int i=2;i<=N;i++){
            if(i>6){
                total=total-dp[i-6];
            }
            
            dp[i]=total*2;
            total+=dp[i];
        }
        
        return total;
    }
}
