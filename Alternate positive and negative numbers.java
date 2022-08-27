//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
       
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                negative.add(arr[i]);
            }else{
                positive.add(arr[i]);
            }
         
        }
        
       
      int k=0;
      int t=0;
        for(int i=0;i<n;i++){
               if(t<negative.size() && k<positive.size()){
                if(i%2==0 && k<positive.size()){
                 arr[i]=positive.get(k);
                 k++;
                 }else if(i%2==1 && t<negative.size()){
                   arr[i]=negative.get(t);
                    t++;
                 }
               }else if(t==negative.size() ){
                   arr[i]=positive.get(k);
                   k++;
               }else {
                   arr[i]=negative.get(t);
                    t++;
               }
              
           
        }
        
        
        
        
    }
}
