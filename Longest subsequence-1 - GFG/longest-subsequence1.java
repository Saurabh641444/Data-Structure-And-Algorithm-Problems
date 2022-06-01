// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine().trim());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubsequence(N, A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubsequence(int N, int A[])
    {
        // code here
        int t[]=new int[N];
        for(int i=0;i<N;i++){
            t[i]=1;
        }
        
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(Math.abs(A[i]-A[j])==1){
                    t[i]=Math.max(t[j]+1,t[i]);
                }
            }
        }
        
        int max=0;
        
        for(int i=0;i<N;i++){
            max=Math.max(t[i],max);
        }
        
        return max;
    }
}