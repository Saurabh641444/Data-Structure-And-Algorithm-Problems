// { Driver Code Starts
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
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        int ans= solve(n,arr);
        
        return ans;
        
    }
    
    private int solve(int n,int t[]){
        if(n==1||n==0) {return t[n]=1;}
        
        else if(t[n]!=-1){ return t[n];}
        
      else{ return t[n]= (solve(n-1,t)+solve(n-2,t))%1000000007;}
    }
}