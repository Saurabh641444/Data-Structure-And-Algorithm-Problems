// { Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java



// class Solution
// {
//     boolean areConsecutives(long arr[], int N)
//     {

//       Arrays.sort(arr);
//       int count=0;
//       for(int i=1;i<N;i++){
//           if(arr[i]-arr[i-1]==1){
//               count++;
//           }
//       }
      
//       return count==N-1 ? true:false;
//     }
// }
class Solution
{
    boolean areConsecutives(long arr[], int N)
    {

    int min=getmin(arr,N);
    int num=0;
    for(int i=0;i<N;i++){
         num^=min^arr[i];
         min+=1;
           }
       return num==0? true:false;
    }
    int getmin(long[] arr,int n){
           int min=(int)arr[0];
       for(int i=1;i<n;i++){

            min=Math.min((int)arr[i],min);
              }
          return min;
         }

     int getmax(int[] arr,int n){
           int max=(int)arr[0];
       for(int i=1;i<n;i++){

            max=Math.max((int)arr[i],max);
              }
          return max;
         }
}

// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            Solution ob = new Solution();
            boolean ans=ob.areConsecutives(a,n);
           // System.out.println(ob.shuffleArray(a,n));
            if(ans)
            System.out.println("Yes");
            else
            System.out.println("No");

        }
    }
}


  // } Driver Code Ends