// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
           int n=scn.nextInt();
           int [] arr=new int[n];
           for(int i=0;i<n;i++){
               arr[i]=scn.nextInt();
           }
           int m=scn.nextInt();
           int ans=0;
           for(int i=0;i<4;i++){
               for(int j=0;j<=i;j++){
                   ans+=arr[j];
               }
           }
           
           for(int i=4;i<n;i++){
               ans+=arr[i]+arr[i-1]+arr[i-2]+arr[i-3];
           }
           
           System.out.println(ans);
        
    }
     
}
