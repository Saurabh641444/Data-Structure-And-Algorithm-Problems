// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new Solution().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        // code here
        // int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]+arr[j]==k){
        //             count++;
        //         }
        //     }
        // }
        
        // return count;
    
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        
        for(int num:arr){
            count+=map.getOrDefault(k-num,0);
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        return count;
        // int count=1;
        // Arrays.sort(arr);
        // int left=0;
        // int right=n-1;
        // while(left<right){
        // if(arr[left]+arr[right]<k){
        //     left++;
        // }
        // else if (arr[left]+arr[right]>k){
        //     right--;
        // }
        // // if(arr[left]+arr[right]==k)
        // else{
        //     left++;
        //     right--;
        //     count++;
        // }}
        // return count;
    }
}
