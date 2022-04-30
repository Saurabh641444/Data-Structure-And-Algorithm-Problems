import java.util.*;
import java.lang.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
        Stack<Integer> evl=new Stack<>();
        Stack<String> pre=new Stack<>();
        Stack<String> inf=new Stack<>();
        
        String exp="264*8/+3-";
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            
          if(Character.isDigit(ch)){
                evl.push(ch-'0');
                pre.push(Character.toString(ch));
                inf.push(Character.toString(ch));
          }
           else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                if(ch=='+'){
                   String op=Character.toString(ch);
                    String v2=inf.pop();
                    String v1=inf.pop();
                    String ans1="("+v1+op+v2+")";
                    inf.push(ans1);
                    
                  
                    String v4=pre.pop();
                    String v3=pre.pop();
                    String ans2="+"+v3+v4;
                    pre.push(ans2);
                    
                    int v6=evl.pop();
                    int v5=evl.pop();
                    int ans3=v5+v6;
                    evl.push(ans3);
                }else if(ch=='-'){
                                        String op=Character.toString(ch);;
                    String v2=inf.pop();
                    String v1=inf.pop();
                    String ans1="("+v1+op+v2+")";
                    inf.push(ans1);
                    
                   
                    String v4=pre.pop();
                    String v3=pre.pop();
                    String ans2="-"+v3+v4;
                    pre.push(ans2);
                    
                    int v6=evl.pop();
                    int v5=evl.pop();
                    int ans3=v5-v6;
                    evl.push(ans3);
                }else if(ch=='*'){
                        String op=Character.toString(ch);;
                    String v2=inf.pop();
                    String v1=inf.pop();
                    String ans1="("+v1+op+v2+")";
                     
                    inf.push(ans1);
                   
                  
                    String v4=pre.pop();
                    String v3=pre.pop();
                    String ans2="*"+v3+v4;
                    pre.push(ans2);
                    
                    int v6=evl.pop();
                    int v5=evl.pop();
                    int ans3=v5*v6;
                    evl.push(ans3);
                }else if(ch=='/'){
                                                                               String op=Character.toString(ch);
                    String v2=inf.pop();
                    String v1=inf.pop();
                    String ans1="("+v1+op+v2+")";
                    inf.push(ans1);
                    
                  
                    String v4=pre.pop();
                    String v3=pre.pop();
                    String ans2="/"+v3+v4;
                    pre.push(ans2);
                    
                    int v6=evl.pop();
                    int v5=evl.pop();
                    int ans3=v5/v6;
                    evl.push(ans3);
                }
            }
        }
        
       System.out.println(evl.peek()+" \n" );
        
       System.out.println(pre.peek()+" \n");
      
       System.out.println(inf.peek()+" ");
    }
}
