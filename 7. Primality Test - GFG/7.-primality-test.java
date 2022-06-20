// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();//input testcases


		while(T-->0)//while testcase have not been exhausted
		{
		    Solution obj=new Solution ();
		    int N;
		    N=sc.nextInt();//input n
		    if(obj.isPrime(N))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPrime(int N) {
      // code here
      if(N==1){ return false;}
      if(N==2||N==3) return true;
      if(N%2==0||N%3==0){ return false;}
      
      for(int i=5;i*i<=N;i=i+6){
          if(N%i==0 || N%(i+2)==0) {
              return false;
          }
      }
      
      return true;
    }
}