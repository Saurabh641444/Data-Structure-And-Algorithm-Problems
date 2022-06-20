// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //taking testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            
                        
            //taking input a and b
            long a = Long.parseLong(str[0]);
            long b = Long.parseLong(str[1]);
            

            //calling multiplicationUnderModulo() function
            System.out.println(new Solution().multiplicationUnderModulo(a, b));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        return ((a%1000000007)*(b%1000000007))%1000000007;
    }
}


