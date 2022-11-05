//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking dimensions of the matrix
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    Solution ob = new Solution();
		    //calling method NumberOfPath()
		    System.out.println(ob.NumberOfPath(a,b));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find total number of unique paths.
    public static int NumberOfPath(int m, int n) 
    {
        //Your code here
        
   int prev[]=new int [n];

   for(int i=0;i<m;i++){
      int temp[]=new int[n];
     for(int j=0;j<n;j++){
          if(i==0 && j==0) temp[j]=1;
          else{

              int up=0,left=0;
               up=prev[j];
              if(j>0) left=temp[j-1];
              temp[j]=up+left;
          }
       }
       prev=temp;
     }
   
 return prev[n-1];
    }
}