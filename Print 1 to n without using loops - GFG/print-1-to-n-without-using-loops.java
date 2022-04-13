// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.printTillN(N);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printTillN(int N){
        // code here
        int start=1;
        solve(start,N);
    }
    
    static void solve(int start, int N){
        if(start==N){
            System.out.print(start+ " ");
            return;
        }
         System.out.print(start+ " ");
          start++;
        solve(start,N);
        
    }
}