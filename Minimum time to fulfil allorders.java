//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int l; 
            l = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, l);
            
            Solution obj = new Solution();
            int res = obj.findMinTime(n, l, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int findMinTime(int n, int l, int[] arr) {
        // code here
        
        Arrays.sort(arr);
        
        int low=arr[0];
        int high=arr[l-1]*n*(n+1)/2;
        int time=0;
        while(low<=high){
            
            int mid=(low+high)/2;
            if(isPossible(mid,n,arr)){
               
               time=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }
            
        }
        
        return time;
    }
    
    private static boolean isPossible(int mid,int n,int [] arr){
        
        int donuts=0;
        
        for(int t:arr){
            
            int timeTaken=0;
            int timeWillTake=t;
            
            while(timeTaken+timeWillTake<=mid){
                donuts++;
                timeTaken+=timeWillTake;
                timeWillTake+=t;
            }
        }
        
        return donuts>=n;
        
    }
}
        
