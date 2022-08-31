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
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            int[] ans = obj.DistinctSum(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] DistinctSum(int[] nums)
    {
        // Code here
        int dp[][]=new int[101][10001];
        Set<Integer> set=new HashSet<>();
        
        DistinctSumRecursive(nums,0,0,set,dp);
        
        int ans[]=new int[set.size()];
        
        int i=0;
        for(Integer val:set){
            ans[i++]=val;
        }
        Arrays.sort(ans);
        return ans;
    }
    
    private void DistinctSumRecursive(int [] nums,int i,int sum,Set<Integer> set,int[][] dp){
        
        if(i==nums.length) {
            set.add(sum);
            return;
            
        }
        
        if(dp[i][sum]!=0) return ;
        
        dp[i][sum]=1;
        
        DistinctSumRecursive(nums,i+1,sum,set,dp);
        DistinctSumRecursive(nums,i+1,sum+nums[i],set,dp);
        
        
        
    }
}
