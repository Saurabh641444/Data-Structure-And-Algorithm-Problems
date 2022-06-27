// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();//taking testcases
        
        while(t-- > 0)
        {
            int n =sc.nextInt();  // taking number "n" as input
            System.out.println(new Solution().countDigits(n)); // prints the count of digits 
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the below function
    public static int countDigits(int n)
    {
        // add your code here
        
        if(n==0) return 1;
        
        return solve(n);
       
    }
    
    private static int solve(int n){
         if(n<=0) return 0;
        return 1+solve(n/10);
    }
}

