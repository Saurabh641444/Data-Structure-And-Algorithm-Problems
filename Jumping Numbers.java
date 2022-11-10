//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.jumpingNums(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long jumpingNums(long X) {
        // code here
        
      Queue<Long> q=new LinkedList<>();

      for(long i=1;i<=9;i++){
           q.add(i);
        }

      long ans=0;

      while(!q.isEmpty()){
         long num=q.remove();
       
         if(num>X){
            continue;
            } 

            ans=Math.max(ans,num);

            int lastDigit=(int) num%10;

            if(lastDigit!=0){
              long first=num*10+(lastDigit-1);
              q.add(first); 
             } 

            if(lastDigit!=9){
                 long first=num*10+(lastDigit+1);
                 q.add(first); 
             } 
 
        }

     return ans;
    }
};
