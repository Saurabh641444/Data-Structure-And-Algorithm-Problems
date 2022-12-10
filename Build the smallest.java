//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String str = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.buildLowestNumber(str,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static String buildLowestNumber(String str, int N) {
        // code here
        Stack<Integer> st=new Stack<>();
        
        st.push(str.charAt(0)-'0');
        
        for(int i=1;i<str.length();i++){
            int ch=str.charAt(i)-'0';
            
            while(N>0 && st.size()>0 && st.peek()>ch){
                st.pop();
                N--;
            }
            st.push(ch);
        }
        
        while(N!=0){
            st.pop();
            N--;
        }
        
        StringBuilder sb=new StringBuilder();
        
        for(int i:st){
            if(sb.length()==0 && i==0) continue;
            sb.append(i);
        }
        
        if(sb.length()==0){
            return "0";
        }else{
            return sb.toString();
        }
    }
}
