// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
   // Function for finding maximum AND value.
    public static int maxAND (int arr[], int N) {
        
        // Your code here
        // You can add extra function (if required)
        
        int bit=0;
        int count=0;
        
        for(int i=30;i>=0;i--){
            bit|=1<<i;
            for(int j=0;j<N;j++){
                if((bit & arr[j])==bit) count++;
            }
            
            if(count<2){
                bit=bit&(bit-1);
            }
            count=0;
        }
        
        return bit;
    }
    
}

// { Driver Code Starts.

class BitWise {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    
		    //input size of array
		    int n = Integer.parseInt(br.readLine());
		    String inputLine[] = br.readLine().trim().split(" ");
		    int arr[] = new int[n];
		    
		    //inserting elements in the array
		    for(int i=0; i<n; i++){
		        arr[i]=Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxAND() method of class AND
		    System.out.println(obj.maxAND(arr, n));
		}
	}
}
  // } Driver Code Ends