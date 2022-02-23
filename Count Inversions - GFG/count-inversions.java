// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// class Solution
// {
//     // arr[]: Input Array
//     // N : Size of the Array arr[]
//     //Function to count inversions in the array.
  
//   static long  inversionCount( long arr[],  long N)
//   {
//      return sort(arr,0,(int)N-1);
//   }
    
//   static long sort(long[] arr,int l, int r){
//       long count=0;
//       if(l<r){
//           int m=l+(r-l)/2;
//           count+=sort(arr,l,m);
//           count+=sort(arr,m+1,r);
//           count+=merge(arr,l,m,r);
//       }
//       return count;
//   }
  
//   static long merge(long[] arr,int l, int m,int r){
//       int n1=m-l+1;
//       int n2=r-m;
      
//       long[] left=new long[n1];
//       long[] right=new long[n2];
      
//       for(int i=0;i<n1;++i){
//           left[i]=arr[l+i];
//       }
      
//      for(int j=0;j<n2;++j){
//          right[j]=arr[m+l+j];
//       }
      
//       int i=0,j=0,k=l;
//       long count=0;
//       while(i<n1 && j<n2){
          
//           if(left[i]<=right[j]){
//               arr[k++]=left[i++];
//           }else{
//               arr[k++]=right[j++];
//               count+=n1-i;
//           }
//       }
//       while(i<n1){ arr[k++]=left[i++];}
//       while(j<n2){ arr[k++]=right[j++];}
//       return count;
//   }

// }

class Solution
{
    static long inversionCount(long arr[], long N)
  {
      return sort(arr,0,(int)N-1);
  }
  
  static long sort(long[] arr,int l ,int r){
      
      long count = 0;
      if(l<r){
      int m = l +(r-l)/2;
      count +=sort(arr,l,m);
      count +=sort(arr,m+1,r);
      count +=merge(arr,l,m,r);
      }
      return count;
  }
  
   static long merge(long[] arr,int l,int m,int r){
     
      int n1 = m - l + 1;
      int n2 = r - m;

      
      long left[] = new long[n1];
      long right[] = new long[n2];

     
      for (int i = 0; i < n1; ++i) left[i] = arr[l + i];
      for (int j = 0; j < n2; ++j) right[j] = arr[m + 1 + j];
    
      
      int i = 0, j = 0, k = l;
      long count = 0;
      while (i < n1 && j < n2) {
          
          if (left[i] <= right[j])
              arr[k++] = left[i++];
          else {
              arr[k++] = right[j++];
              count += n1-i;
          }
      }
      while (i < n1)    arr[k++] = left[i++];
      while (j < n2)    arr[k++] = right[j++];
      
      return count;    
  }
}