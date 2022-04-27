import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);     
String exp="-+2/*6483";  

Stack<Integer> vs=new Stack<>();// value stack
Stack<String> is=new Stack<>();// infix stack
Stack<String> ps=new Stack<>();// postfix stack

for( int i=exp.length()-1;i>=0;i--){
    char ch=exp.charAt(i);
     
     if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
               int v1=vs.pop();
               int v2=vs.pop();
               int val=operation(v1,v2,ch);
               vs.push(val);

               String inv1=is.pop();
               String inv2=is.pop();
               String inval="("+inv1+ch+inv2+")";
               is.push(inval);

               String pv1=ps.pop();
               String pv2=ps.pop();
               String pval=pv1+pv2+ch;
               ps.push(pval);
          }else{
             vs.push(ch-'0');
             is.push(ch+"");
             ps.push(ch+"");

         }

}

       System.out.println(vs);
        System.out.println(is);
         System.out.println(ps);
    }
    private static int operation(int v1,int v2, char ch){
        if(ch=='+'){
            return v1+v2;
        }else if(ch=='-'){
            return v1-v2;
        }else if(ch=='*'){
            return v1*v2;
        }else if(ch=='/'){
            return v1/v2;
        }
        return 0;
    }
}
