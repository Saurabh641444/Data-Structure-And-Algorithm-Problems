//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            int K = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countOfSubstrings(S,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countOfSubstrings(String S, int K) {
        // code here
        int ans=0;
        int n=S.length();
        Map<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<K;i++){
        hm.put(S.charAt(i),hm.getOrDefault(S.charAt(i),0)+1);            
        }
        
        if(hm.size()==K-1){
            ans++;
        }
        
        for(int i=K;i<n;i++){
            if(hm.get(S.charAt(i-K))>0){
                hm.put(S.charAt(i-K),hm.get(S.charAt(i-K))-1);
                
                if(hm.get(S.charAt(i-K))==0){
                    hm.remove(S.charAt(i-K));
                }
            }
            
            
            
            hm.put(S.charAt(i),hm.getOrDefault(S.charAt(i),0)+1); 
            
            if(hm.size()==K-1){
                ans++;
            }
        }
        
        return ans;
        
    }
};
