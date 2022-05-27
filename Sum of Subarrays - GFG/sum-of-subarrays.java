// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.subarraySum(a, n));
        }
	}
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public static long subarraySum( long a[], long n) {
       // code here  
       long mod=1000000007;
       long res=0;
    //   for(int i=0;i<n;i++){
    //       long temp=0;
    //       for(int j=i;j<n;j++){
    //           temp+=a[j];
    //           res+=temp;
    //       }
    //   }
    
    for(int i=0;i<n;i++){
        
        res+=(n-i)*a[i]*(i+1)%mod;
        
    }
       
       return res%mod;
    }
}
