// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> res=new ArrayList<>();
        res.add(1);
        
        for(int x=2;x<=N;x++){
            int carry=0;
            
            for(int i=0;i<res.size();i++){
                
                int a=res.get(i)*x+carry;
                res.set(i,a%10);
                carry=a/10;
            }
            
            while(carry>0){
                res.add(carry%10);
                carry/=10;
            }
        }
        Collections.reverse(res);
        return res;
    }
}