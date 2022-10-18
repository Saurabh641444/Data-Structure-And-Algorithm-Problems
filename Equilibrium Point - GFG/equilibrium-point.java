//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        
        if(n==1){
            return 1;
        }
        
        int low=0;
        int high=n-1;
        
        int i=low;
        int j=high;
        
        long pre_sum=0;
        long su_sum=0;
         pre_sum+=arr[low];
            su_sum+=arr[high];
        
        while(low<high){
           
            
            if(pre_sum<su_sum){
                low++;
                pre_sum+=arr[low];
            }else if(pre_sum>su_sum){
                high--;
                 su_sum+=arr[high];
            }else{
                low++;
                high--;
                pre_sum+=arr[low];
            su_sum+=arr[high];
            }
        }
        // System.out.println(pre_sum+" "+su_sum);
        
        if(pre_sum==su_sum && high!=i && j!=low){
            return low+1;
        }
        return -1;
    }
}
