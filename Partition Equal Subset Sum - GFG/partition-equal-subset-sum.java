//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int TotalSum=0;
        
        for(int num:arr) TotalSum+=num;
        
        if(TotalSum%2!=0) return 0;
        
        int target=TotalSum/2;
        
        boolean dp[][]=new boolean[N+1][target+1];
        
        for(int i=0;i<N;i++){
            dp[i][0]=true;
        }
        
        if(arr[0]<=target)
           dp[0][arr[0]]=true;
        
        for(int ind=1;ind<N;ind++){
            for(int sum=0;sum<target+1;sum++){
             boolean notTake=dp[ind-1][sum];
            boolean take=false;
        
        if(sum>=arr[ind])
          take= dp[ind-1][sum-arr[ind]];
           
       dp[ind][sum]= notTake || take; 
            }
        }
        
        return dp[N-1][target]?1:0;
        // for(int[] a:dp) Arrays.fill(a,-1);
        
        // return helper(arr,N-1, target,dp)? 1:0;
    }
    
    static boolean helper(int[] arr,int n,int target, int dp[][]){
        
        if(0==target){
            return true;
        }
        
        if(n==0) return arr[0]==target;
        
        if(dp[n][target]!=-1) return dp[n][target]==1? true:false;
        
        boolean notTake=helper(arr,n-1,target,dp);
        boolean take=false;
        
        if(target>=arr[n])
          take= helper(arr,n-1,target-arr[n],dp);
           
       boolean val= notTake || take; 
       
       if(val){
           dp[n][target]=1;
       }else{
           dp[n][target]=0;
       }
       
       return val;
    }
}