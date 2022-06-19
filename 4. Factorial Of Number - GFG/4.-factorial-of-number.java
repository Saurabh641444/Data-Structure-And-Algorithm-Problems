// { Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        //taking testcases
        int T = sc.nextInt();
        while (T-- > 0) {
            
            //creating an object of class Factorial
            Solution obj = new Solution();
            int N;
            
            //taking N
            N = sc.nextInt();
            
            //calling factorial() method 
            //of class Factorial
            System.out.println(obj.factorial(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public long factorial(int N) {
        // Your code here
        if(N==0 || N==1) return 1;
        return N*factorial(N-1);
    }
}
