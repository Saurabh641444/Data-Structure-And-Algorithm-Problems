// { Driver Code Starts
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
            String S = read.readLine().trim();
            Solution ob = new Solution();
            ArrayList<String> ans = new ArrayList<String>();
            ans = ob.permutation(S);
            
            for(int i=0;i<ans.size();i++){
                System.out.print("("+ans.get(i)+")");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    
    ArrayList<String> permutation(String S){
        // Code Here
        ArrayList<String> list=new ArrayList<>();
        if(S.length()==0) return list;
       String op=""+S.charAt(0)+"";
        
        solve(S.substring(1,S.length()),op,list);
        
        return list;
    }
    
    static void solve(String s,String op,ArrayList<String> list){
        if(s.length()==0){ 
            list.add(op);
            return;}
        
        String newS=s.substring(1,s.length());
       String op1=op+" "+s.charAt(0);
        String op2=op+s.charAt(0);
        solve(newS,op1,list);
        solve(newS,op2,list);
    }
    
}