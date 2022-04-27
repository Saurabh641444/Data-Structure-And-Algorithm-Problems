import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);     
        String exp="[(a+b)())+{(c+d)*(e/f)]}";
         
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            
             if(ch==')' || ch==']' || ch=='}'){
                 if((ch==')' || ch==']' || ch=='}')&& st.isEmpty()){ System.out.println("Not balanced");
                     
                     return;
                 }
                 if(ch==')'){
                     while(!st.isEmpty() && st.peek()!='('){st.pop();}
                     
                      if((ch==')' || ch==']' || ch=='}')&& st.isEmpty()){ System.out.println("Not balanced");
                     
                     return;
                 }
                 st.pop();
                 }
                 
                 if(ch==']'){
                     while(!st.isEmpty() && st.peek()!='['){st.pop();}
                     
                      if((ch==')' || ch==']' || ch=='}')&& st.isEmpty()){ System.out.println("Not balanced");
                     
                     return;
                 }
                 st.pop();
                 }
                 
                 if(ch=='}'){
                     while(!st.isEmpty() && st.peek()!='{'){st.pop();}
                     
                      if((ch==')' || ch==']' || ch=='}')&& st.isEmpty()){ System.out.println("Not balanced");
                     
                     return;
                 }
                 st.pop();
                 }
             }else{
                 st.push(ch);
             }
        }
             if(st.isEmpty()){System.out.println(" balanced");}
             else{System.out.println("Not balanced");}

    }
   
}
