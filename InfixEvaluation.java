import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
    //   String exp="2+(5-3*6/2)";
    String exp="((3+1)*2)";
       Stack<Integer> opd=new Stack<>();
       Stack<Character> opr=new Stack<>();
       
       for(int i=0;i<exp.length();i++){
           char ch=exp.charAt(i);
           if(Character.isLetterOrDigit(ch)){
               opd.push(ch-'0');
           }else if(ch=='('){opr.push(ch);}
           else if(ch==')'){ 
               while(!opr.isEmpty()&& opr.peek()!='('){
                   int a=opd.pop();
                   int b=opd.pop();
                   char operation=opr.pop();
                   int ans=solve(b,a,operation);
                   opd.push(ans);
               }
               opr.pop();
           }
           else{
               while(!opr.isEmpty()&& checkPriority(opr.peek(),ch)){
                   
                   int a=opd.pop();
                   int b=opd.pop();
                   char operation=opr.pop();
                   int ans=solve(b,a,operation);
                   opd.push(ans);
                   
               }
               
               opr.push(ch);
   
           }
       }
       
                   while(!opr.isEmpty()){ int a=opd.pop();
                   int b=opd.pop();
                   char operation=opr.pop();
                   int ans=solve(b,a,operation);
                   opd.push(ans);}
       System.out.println(opd.peek());
       
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
