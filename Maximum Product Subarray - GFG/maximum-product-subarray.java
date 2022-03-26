// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        
        long ans=Integer.MIN_VALUE;
        long current_product=1;
        for(int i=0;i<n;i++){
            current_product=1;
            for(int j=i;j<n;j++){
                current_product=current_product*arr[j];
                if(ans<current_product){ ans=current_product;}
            }
        }
       
       return ans; 
    }
}

/*class Solution{
public long maxProduct(int[] nums,int n){
    //   int n=nums.length;
      long result=nums[0];
      int curr_max=nums[0];
      int curr_min=nums[0];
      for(int i=1;i<n;i++){
            int curr_max_prev=curr_max;
            curr_max=Math.max(nums[i],Math.max(curr_max*nums[i],curr_min*nums[i]));
             curr_min=Math.min(nums[i],Math.min(curr_max_prev*nums[i],curr_min*nums[i]));
              result=Math.max(result,curr_max);
       }
      
      return result;
     }
}*/
