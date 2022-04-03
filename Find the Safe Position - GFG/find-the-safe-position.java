// { Driver Code Starts

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int k = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.safePos(n,k));
        }
    }
}// } Driver Code Ends



class Solution {
    static int safePos(int n, int k) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int ans=solve(arr,0,k-1);
        return ans;
    }
    static int solve( ArrayList<Integer> arr,int index, int k){
        if(arr.size()==1){
            return arr.get(0);
        }
        int i=(index+k)%arr.size();
        arr.remove(i);
        return solve(arr,i,k);
    }
};