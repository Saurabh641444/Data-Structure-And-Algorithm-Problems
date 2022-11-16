//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            //br.readLine();
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            int res = obj.beautySum(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int beautySum(String s) {
        // code here
        int res=0;
        int n=s.length();
        
        for(int i=0;i<n;i++){
            res+=solve(i,s,n);
        }
        
        return res;
    }
    
    private static int solve(int i,String s,int n){
        int arr[]=new int[26];
        
        int ans=0;
        
        for(int j=i;j<n;j++){
            char ch=s.charAt(j);
            arr[ch-'a']++;
            
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            
            for(int k=0;k<26;k++){
                if(arr[k]>0){    
                if(min>arr[k]) min=arr[k];
                if(max<arr[k]) max=arr[k];
                }
            }
            
            ans+=max-min;
        }
        
        return ans;
    }
}
        
