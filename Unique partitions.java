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
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(n);
            for(ArrayList<Integer>i: ans)
                for(int j: i)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        // Code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        
        dfs(n,n,ans,new ArrayList<Integer> ());
        return ans;
    }
    
    private void dfs(int n, int m, ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> bucket){
        
       if(n==0){
           ans.add(new ArrayList<>(bucket));
           return;
       }
       
       
       for(int i=m;i>=1;i--){
           if(n-i>=0){
               bucket.add(i);
               dfs(n-i,i,ans,bucket);
               bucket.remove((Integer)i);
           }
       }
       
       
    }
}
