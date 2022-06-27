// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();//taking total testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();//taking number n
            
            //calling digitalRoot() function of 
            //class Digital
            System.out.println(new Solution().digitalRoot(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
        // add your code here
        
        if( n<10){ return n;}
        return digitalRoot(n/10+n%10);
    }
    
    private static int solve(int n,int prev, int sum){
        if(n==0){
            if( sum<10){ return sum;}
            else{
                sum=sum+prev;
                return sum%10;
            }
        }
       
        return solve(n/10,n%10,sum+n%10);
    }
}