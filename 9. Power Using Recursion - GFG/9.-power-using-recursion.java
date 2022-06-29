// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();//testcases
        
        while(t-- > 0)
        {
            //input n and p
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            //calling RecursivePower() method 
            System.out.println(new Solution().RecursivePower(n,p));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{    static int ans=0;
    static int RecursivePower(int n,int p)
    {
        // add your code here
        if(p==0) return 1;
        if(p==1) return n;
        return n*RecursivePower(n,p-1);
    }
    
   
}
