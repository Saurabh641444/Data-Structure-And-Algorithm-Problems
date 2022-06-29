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
        //testcases        
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //input string
            String st = sc.next();
            
            //calling powerSet() function
            ArrayList<String> ans = new LexSort().powerSet(st);
            
            //sorting the result of the powerSet() function
            Collections.sort(ans);
    
            //printing the result
            for(String s: ans)
                System.out.print(s + " ");
            System.out.println();    
        }
    }
}


 // } Driver Code Ends
//User function Template for Java


class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> ans=new ArrayList<>();
       solve(s,"",ans);
       
       return ans;
    }
    
    static void solve(String ip,String op,ArrayList<String> ans){
        if(ip.length()==0) {ans.add(op);
           return ;}
           
           String op1=op;
           String op2=op;
           
           op2+=ip.charAt(0);
           ip=ip.substring(1);
           
           solve(ip,op1,ans);
           solve(ip,op2,ans);
    }
}


 

// { Driver Code Starts.

                                // } Driver Code Ends