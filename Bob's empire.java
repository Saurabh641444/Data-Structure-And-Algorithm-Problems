import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String name = br.readLine();                // Reading input from STDIN
        // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
    
       int t=Integer.parseInt(br.readLine().trim());
       while(t-->0){
           int N=Integer.parseInt(br.readLine().trim());
           String str[]=br.readLine().trim().split(" ");
           int arr[]=new int[str.length];

           for(int i=0;i<arr.length;i++){
               arr[i]=Integer.parseInt(str[i]);
           } 

           int max=Integer.MIN_VALUE;

           for(int i=0;i<arr.length;i++){
               max=Math.max(((N+arr[i]-1)/arr[i]),max);
           }

           System.out.println(max+3);
       }

    
    }
}
