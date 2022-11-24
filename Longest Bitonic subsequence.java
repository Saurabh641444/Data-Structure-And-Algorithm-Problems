//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution

{

    public int LongestBitonicSequence(int[] nums)

    {

        int N = nums.length;

        int [] LIS = new int[N];

        int [] LDS = new int[N];

        

        for(int i=0; i< N; i++){

            LIS[i] = 1;

            for(int j=0; j< i; j++){

                if(nums[i] > nums[j] ){

                    if(LIS[j]+1 > LIS[i]) LIS[i] = LIS[j] + 1;

                }

            }

        }

        for(int i= N-1; i>=0; i--){

            LDS[i] = 1;

            for(int j= N-1; j> i; j--){

                if(nums[i] > nums[j]){

                    if(LDS[j]+1 > LDS[i]) LDS[i] = LDS[j] + 1;

                }

            }

        }

        

        int Max = 0;

        for(int i=0; i< N; i++){

            Max = Math.max(Max, LIS[i]+ LDS[i] -1);

        }

        return Max;

    }

}
