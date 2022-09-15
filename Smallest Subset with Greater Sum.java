//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.Collections;


class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
            int N = sc.nextInt();
            int[] Arr = new int[N];
            for (int i = 0; i < N; ++i){
                Arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            int ans = ob.minSubset(Arr,N);
            System.out.println(ans);
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
    int minSubset(int[] Arr,int N) { 
        /*
         1. Firstly what I have to find ? => I have to find the elements whose sum value is greater than sum of rest of array.
         2. Then I will sort the array and will do the summation of all elements.
         3. I will iterate from end of array and maintain 1 variable in which I will store the curr sum i.e. sum till now.
         4. when curr_sum>sum I will break the loop.
        */
        long sum=0;
        
        for(int i=0;i<Arr.length;i++){
            sum+=Arr[i];
        }
        
        Arrays.sort(Arr);
        
        long curr=0;
        int cnt=0;
        
        for(int j=Arr.length-1;j>=0;j--){
            curr+=Arr[j];
            
            if(curr>(sum-curr)) break;
            
            cnt++;
        }
        
        return cnt+1;
    }
}
