import java.util.*;
import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
          Scanner scn=new Scanner(System.in);
           int T=scn.nextInt();  
          while(T>0){         
           int n=scn.nextInt();
           int [] arr=new int[n];
           int []LS=new int[n];
           int [] RS=new int[n];

           for(int i=0;i<n;i++){
                 arr[i]=scn.nextInt();
 
               }

             LS[0]=arr[0];
             RS[n-1]=arr[n-1];
             for(int i=1;i<n;i++){ LS[i]=LS[i-1]+arr[i];}
             for(int i=n-2;i>=0;i--){ RS[i]=RS[i+1]+arr[i];}
            int ans1=0;
            int ans2=0;
             for(int i=1;i<n-1;i++){  if(LS[i-1]==RS[i+1]){
                 ans1=i+1;
                 ans2=LS[i-1];
                 break;
                 }
             }
             

           System.out.print(ans1+" "+ans2);
          T--; 
        }
    }
     
}
