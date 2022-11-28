//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            ArrayList<Integer> ans = new Solution().findSubarray(a, n);
            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        
        int currSum=0;
        int maxSum=0;
        int start=0;
        int end=0;
        int newStart=0;
        int newEnd=0;
        
        for(int i=0;i<n;i++){
           
            
             if(a[i]<0) {
                currSum=0;
                newStart=i+1;
                // newEnd=i;
            }else{
                currSum+=a[i]; 
            }
            
            if(currSum>maxSum){
             maxSum=currSum;
             start=newStart;
             end=i;
             
            }else if(currSum==maxSum && (i-newStart+1>end-start+1)){
                start=newStart;
                end=i;
            }
          
        }
        
        // System.out.println(maxSum);
         ArrayList<Integer> ans=new ArrayList<>();
         
        if(maxSum<=0) {
            
            ans.add(-1);
            return ans;
        }
       
        
        for(int i=start;i<=end;i++){
            ans.add(a[i]);
        }
        
        if(ans.size()==0) ans.add(-1);
        return ans;
    }
}
