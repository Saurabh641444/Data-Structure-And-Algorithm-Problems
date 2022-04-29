import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
      String exp="(A+B)*C-(D*E)-(F+G)";
    // String exp="a*(b-c)/d+e";
       Stack<String> pre=new Stack<>();
       Stack<String> pos=new Stack<>();
       Stack<Character> opr=new Stack<>();
       
       for(int i=0;i<exp.length();i++){
           char ch=exp.charAt(i);
           if(Character.isLetterOrDigit(ch)){
               pre.push(Character.toString(ch));
               pos.push(Character.toString(ch));
           }else if(ch=='('){opr.push(ch);}
           else if(ch==')'){ 
               while(!opr.isEmpty()&& opr.peek()!='('){
                   String v2=pre.pop();
                   String v1=pre.pop();
                   char operation=opr.pop();
                   String ans=Character.toString(operation)+v1+v2;
                   pre.push(ans);
                   
                   String v4=pos.pop();
                   String v3=pos.pop();
                
                   String ans2=v3+v4+Character.toString(operation);
                   pos.push(ans2);
               }
               opr.pop();
           }
           else{
               while(!opr.isEmpty()&& checkPriority(opr.peek(),ch)){
                   
                   String v2=pre.pop();
                   String v1=pre.pop();
                   char operation=opr.pop();
                   String ans=Character.toString(operation)+v1+v2;
                   pre.push(ans);
                   
                   String v4=pos.pop();
                   String v3=pos.pop();
                
                   String ans2=v3+v4+Character.toString(operation);
                   pos.push(ans2);
                   
               }
               
               opr.push(ch);
   
           }
       }
       
                   while(!opr.isEmpty()){ String v2=pre.pop();
                    
                   String v1=pre.pop();
                   char operation=opr.pop();
                   String ans=Character.toString(operation)+v1+v2;
                   pre.push(ans);
                   
                   String v4=pos.pop();
                   String v3=pos.pop();
                
                   String ans2=v3+v4+Character.toString(operation);
                   pos.push(ans2);
                       
                   }
       System.out.println(pre.peek()+" ");
        System.out.println(pos.peek());
       
    }
     
     private static int solve(int a,int b, char op){
         if(op=='+'){ return a+b;}
         else if(op=='-'){ return a-b;}
         else if(op=='*'){ return a*b;}
         else if(op=='/'){ return a/b;}
         return 0;
     }
    private static boolean checkPriority(char prev,char next){
        int a=PriorityOrder(prev);
        int b=PriorityOrder(next);
        
        if(a==b || a>b){
            return true;
        }
        
        return false;
    }
    
    private static int PriorityOrder(char ch){
        if(ch=='/'||ch=='*'){ return 2;}
      else if(ch=='-'||ch=='+'){return 1;}
      return -1;
    }
}
