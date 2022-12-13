//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int totalSum=0,max=Integer.MIN_VALUE;
        
        for(int a:arr){
            totalSum+=a;
            max=Math.max(max,a);
        }
        
        int low=max, high=totalSum,ans=Integer.MAX_VALUE;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(isValid(arr,mid,K)){
                ans=Math.min(ans,mid);
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        return ans;
    }
    
    static boolean isValid(int[] arr,int requiredSum, int k){
        int sum=0;
        int count=1;
        
        for(int a:arr){
            if(sum+a<=requiredSum){
                sum+=a;
            }else{
                sum=a;
                count++;
            }
        }
        
        return count<=k;
        
    }
    
};
