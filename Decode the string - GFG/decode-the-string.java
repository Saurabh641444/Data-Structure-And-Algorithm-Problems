//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            out.println(ob.decodedString(s));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
        // code here
        Stack<Integer> digit=new Stack<>();
        Stack<String>     st=new Stack<>();
        
        int n=s.length();
        
        int i=0;
        
        while(i<n){
         char ch=s.charAt(i);
         
         if(Character.isDigit(ch)  ){
             st.push("0");
            //  digit.push(ch-'0');
             i++;
            String num=""+ch+"";
            while(i<n && Character.isDigit(s.charAt(i))){
                num=num+""+s.charAt(i)+"";
                i++;
            }
            digit.push(Integer.parseInt(num));
            
             
         }else if(ch=='['){
             i++;
             continue;
         }else if(Character.isLetter(ch)){
             st.push(""+ch+"");
             i++;
         }else if(ch==']'){
             
             
             
             int k=1;
             
             if(digit.size()>0){
                 k=digit.pop();
             }
             String ans="";
             while(st.size()>0){
                 String peek=st.pop();
                 
                 if(peek.length()==1 && peek.charAt(0)=='0'){
                    //  System.out.println(peek+" Euu");
                     break;
                 }
                //   System.out.println(peek+" Euu");
                 ans=peek+ans;
             }
             
            
             String res="";
             for(int j=0;j<k;j++){
                 res+=ans;
             }
             
            //   System.out.println(res);
             st.push(res);
            i++; 
         }
         
         
        }
        
        if(digit.size()==0 && st.size()>1){
          String str="";
          while(st.size()>0){
              str+=st.pop();
          }  
          
          st.push(str);
            
        } 
        
       
           
        return st.peek();
        
    }
}