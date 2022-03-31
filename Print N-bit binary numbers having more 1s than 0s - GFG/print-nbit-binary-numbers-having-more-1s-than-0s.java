// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        // code here
        
        ArrayList<String> list=new ArrayList<>();
        int one=1;
        int zero=0;
        String op="1";
        solve(N-1,one,zero,op,list);
        return list;
    }
    
    public static void solve(int N,int one,int zero,String op, ArrayList<String> list ){
        if(N==0){
            list.add(op);
            return;
        }
        
         solve(N-1,one+1,zero,op+"1",list);
        
        if(one>zero){
            
            solve(N-1,one,zero+1,op+"0",list);
        }
        
    }
}