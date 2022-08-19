import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

 /*   public static int superDigit(String n, int k) {
    // Write your code here
       
       String str="";
        int sum=0;
        int xor=n.charAt(0);
       for(int i=0;i<n.length();i++){
            sum+=(n.charAt(i)-'0');
            if(i>0){
            xor=xor^(n.charAt(i)-'0');}
        }
        
        if(xor==0) return n.charAt(0);
        sum=sum*k;
        // for(int i=0;i<k;i++) str+=n;
    //    System.out.println(str);
    str=""+sum+"";
    
    //     while(str.length()>9){
    //         for(int i=0;i<str.length();i++){
    //         sum+=(str.charAt(i)-'0');
    //     }
    //     sum=sum*k;
    // //    System.out.println(str);
    // str=""+sum+"";
    //     }
        return solve(str);
    }
    */
    
       public static int superDigit(String n, int k) {
            if(n.length()==1) return Integer.parseInt(n);
            long sum=0;
            for(int i=0;i<n.length();i++){
               sum+=n.charAt(i)-'0'; 
            }
            
           return superDigit(String.valueOf(sum*k),1); 
       }
    // private static int solve(String s){
        
    //     if(s.length()==1) return (s.charAt(0)-'0');
        
    //     String str="";
    //     int sum=0;
    //     for(int i=0;i<s.length();i++){
    //         sum+=(s.charAt(i)-'0');
    //     }
    //     str=""+sum+"";
    //     return solve(str);
    // }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
