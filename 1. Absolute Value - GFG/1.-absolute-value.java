// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // number of testcases
        while (T > 0) {
            int I = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.absolute(I));

            T--;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int absolute(int I) {
        // code here
        return Math.abs(I);
    }
}
