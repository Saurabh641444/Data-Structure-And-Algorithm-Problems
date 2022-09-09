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
            String ans = ob.digitsNum(n);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String digitsNum(int N)
    {
        // Code here
        
        StringBuilder sb=new StringBuilder();
        
        if(N%9!=0){
            sb.append(N%9);
        }
        
        int count=N/9;
        
        for(int i=1;i<=count;i++) sb.append("9");
        
        for(int i=1;i<=N;i++) sb.append("0");
        
        return sb.length()==0 ?"0":sb.toString();
        
        
    }
}
