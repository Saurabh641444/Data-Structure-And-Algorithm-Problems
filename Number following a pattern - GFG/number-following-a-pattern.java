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
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.printMinNumberForPattern(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        String res="";
        Stack<Integer> st=new Stack<>();
        int num=1;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='I'){
                 st.push(num); 
              num++;
                while(!st.isEmpty()){
                   int t=st.peek();
                   res=res+""+t;
                   st.pop();
                }
             
            }else{
            st.push(num);
                num++;
            }
        }
         st.push(num);
         while(!st.isEmpty()){
                   int t=st.peek();
                   res=res+""+t;
                   st.pop();
                }
        return res;
    }
}
