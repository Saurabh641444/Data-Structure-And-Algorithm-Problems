//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fillingBucket(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int fillingBucket(int N) {
        // code here
        int a=1;
        int b=2;
        int mod=1_000_000_00;
        if(N==1) return 1;
        if(N==2) return 2;
        
        while(N-2>0){
            int c=(a+b)%mod;
            a=b;
            b=c;
            N--;
        }
        
        return b%mod;
    }
};
