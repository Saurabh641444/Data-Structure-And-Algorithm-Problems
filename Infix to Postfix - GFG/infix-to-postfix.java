// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<Character> st=new Stack<>();
        String res="";
        
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            
            if(Character.isLetterOrDigit(c)){
                
          res+=c;
            }else if(c=='('){
              st.push(c);
            }
            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res+=st.pop();
                }
             st.pop();
            }else{
                while(!st.isEmpty() && precedence(c)<=precedence(st.peek()) && isLeftToRightAss(c)){
                    res+=st.pop();
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
    
    private static int precedence(char c){
        if(c=='+'||c=='-'){
            return 1;
        }else if(c=='*'|| c=='/'){
            return 2;
        }else if(c=='^'){
            return 3;
        }
            return -1;
        
    }
    
    private static boolean isLeftToRightAss(char c){ return c!='^';}
}