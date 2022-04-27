import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);     
        String exp="(a+b)()+((c+d))";
         
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            
             if(ch!=')'){
                st.push(ch);     
                }else if(ch==')'){
                    if(st.peek()=='('){ 
                        System.out.println("Duplicate bracket exist");
                        return;}
                  while(!st.isEmpty() && st.peek()!='('){ st.pop();}
                    st.pop();
                    }
           
           }  
         if(st.isEmpty()){ System.out.println("Duplicate not exist");}
       else{System.out.println("Duplicate bracket exist");}

    }
   
}
