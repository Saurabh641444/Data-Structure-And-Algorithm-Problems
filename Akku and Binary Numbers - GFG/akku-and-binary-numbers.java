// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        Solution ob = new Solution();
        ob.precompute();
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            long L = Long.parseLong(input_line[0]);
            long R = Long.parseLong(input_line[1]);
            long ans = ob.solve(L, R);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    void precompute(){}
    
    static long binary(long n){
        // Code Here
        int count=0;
        
        while(n>0){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
    
  
    long solve(long l, long r){
        // Code here
        
        // long count=0;
        // // System.out.println(L + " "  + R);
        // // long val=0;
        // for(long i=L;i<=R;i++){
            
        //      long val=binary(i);

        
            
        //     if(val==3){
        //         count++;
        //     }
        // } 
        // return count;

       long i = 1;
 long cnt = 0;

while (i < r)
{
    long j = i << 1;
    
    while (j < r)
    {
        long k = j << 1;
        
        while (k < r)
        {
           long tmp = i | j | k;
            
            if (l <= tmp && tmp <= r)
                ++ cnt;
            
            k <<= 1;
        }
        
        j <<= 1;
    }
    
    i <<= 1;
}

return cnt;

}
    
}
