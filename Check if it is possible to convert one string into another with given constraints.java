//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Solution ob = new Solution();
            System.out.println(
                ob.isItPossible(S[0], S[1], S[0].length(), S[1].length()));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isItPossible(String S, String T, int M, int N) {
        // code here
        
        int i=0;
        int j=0;
        
        while(i<M && j<N){
            if(S.charAt(i)=='#'){
                i++;
            }else if(T.charAt(j)=='#'){
                j++;
            }else if(S.charAt(i)!=T.charAt(j) || (S.charAt(i)=='A' && i<j) || (S.charAt(i)=='B' && i>j)){
                return 0;
            }else{
                i++;
                j++;
            }
        }
        
        while(i<M && S.charAt(i)=='#') i++;
        
        while(j<N && T.charAt(j)=='#') j++;
        
        if(i==M && j==N) return 1;
        
        return 0;
    }
};
