// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            System.out.println(new Solution().getNthUglyNo(n));
        }
    }
}// } Driver Code Ends


class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        // code here
        TreeSet<Long> t=new TreeSet<>();
        t.add(1L);
        
        int i=1;
        
        while(i<n){
            long temp=t.pollFirst();
            t.add(temp*2);
            t.add(temp*3);
            t.add(temp*5);
            i++;
        }
        
        return t.pollFirst();
    }
}