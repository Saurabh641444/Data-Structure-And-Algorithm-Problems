//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    long[] arr= new long[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        arr[i] = Long.parseLong(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(arr, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(arr[i] + " ");
		    System.out.println(sb);
		}
	}
}




// } Driver Code Ends


class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        
        // Your code here
        
        ArrayList<Long> small=new ArrayList<>();
        ArrayList<Long> big=new ArrayList<>();
        
        int mid=0;
        
        if(n%2==0){
            mid=n/2;
        }else{
            mid=(n+1)/2;
        }
        
        // System.out.println(mid);
        
        for(int i=0;i<mid;i++){
            small.add(arr[i]);
        }
        
        for(int i=mid;i<n;i++){
            big.add(arr[i]);
        }
        
        int k=0;
        
        for(int i=0;i<n && k<small.size();i++){
            if(i%2!=0){
                arr[i]=small.get(k++);
            }
        }
        
        int l=big.size()-1;
        for(int i=0;i<n && l>=0;i++){
            if(i%2==0){
                arr[i]=big.get(l--);
            }
        }
        
        if(k<small.size()){
            arr[n-1]=small.get(small.size()-1);
        }
    }
    
}


