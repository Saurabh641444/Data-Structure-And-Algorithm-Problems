//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.ReFormatString(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static String ReFormatString(String S, int K){
        // code here
       StringBuilder sb=new StringBuilder();
       
       int j=S.length()-1;
       int count=1;
       while(j<S.length() && j>=0){
           char ch=S.charAt(j);
           if(ch=='-'){
               j--;
               continue;
           }
           if(count==K+1){
               sb.append('-');
               count=1;
           }
           sb.append(Character.toUpperCase(ch));
           j--;
           count++;
       }
        return sb.reverse().toString();
    }
}
