//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            ArrayList<Long> A = new ArrayList<Long>();
            String in[] = read.readLine().trim().split(" ");
            for(var i : in){
                Long x = Long.parseLong(i);
                A.add(x);
            }

            Solution ob = new Solution();
            System.out.println(ob.numberOfSubsequences(N,A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
   
    static Long numberOfSubsequences(int N, ArrayList<Long> A){
        // code here
         long count=0;
        long prev=Long.MIN_VALUE;
        // solve(N,A,prev,0);
        for(Long i:A){
            if(powerof2(i)) count++;
        }
        return (long) (Math.pow(2,count)%1000000007-1)%1000000007;
    }
    
    // static void solve(int N,ArrayList<Long> A,long prev,int i){
        
    //     if(i==N){
    //         if(powerof2(prev) && prev!=Long.MIN_VALUE){ 
    //             // System.out.println(prev);
    //             count++;}
    //         return;
    //     }
        
    //     solve(N,A,prev,i+1);
    //     if(prev==Long.MIN_VALUE) prev=1;
    //     solve(N,A,prev*A.get(i),i+1);
    // }
    
    static boolean powerof2(long n){
        if(n==0) return false;
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }else return false;
        }
        
        return true;
    }
    
}
