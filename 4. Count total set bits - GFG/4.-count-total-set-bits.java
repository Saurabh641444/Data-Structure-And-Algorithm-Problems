// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
       int count=0;
    
        while(n>0){
         int x=(int)(Math.log(n)/Math.log(2));
         int k=(int)Math.pow(2,x);
         int y=n-k;
         count+=(k/2)*x;
         count+=y+1;
         n=y;
        }
       
        return count;
            
    }
    
    private static int largestPowerOf2inrange(int n){
      int x=0;

      while((1<<x)<=n){
             x++;
        }
      return x-1;
    }
}


// { Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}
  // } Driver Code Ends