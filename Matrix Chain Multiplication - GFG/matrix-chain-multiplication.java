// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   static int[][] t=new int[1001][1001];
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
       
      
      for(int i=0;i<N+1;i++){
          for(int j=0;j<N+1;j++){
              t[i][j]=-1;
          }
      }
      return MCM(arr,1,N-1);
              
    }
    
    static int MCM(int[] arr,int i,int j){
        if(i>=j) return 0;
        if(t[i][j]!=-1){
            return t[i][j];
        }
        int min=Integer.MAX_VALUE;
        
        for(int k=i;k<=j-1;k++){
            int temp=MCM(arr,i,k)+MCM(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
            if(temp<min){
                min=temp;
            }
        }
        
        return t[i][j]=min;
    }
}