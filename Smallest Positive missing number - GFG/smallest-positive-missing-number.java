// { Driver Code Starts
import java.util.*;


 // } Driver Code Ends


class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int nums[], int size)
    {
        // Your code here
        
         boolean contains_one=false;
        for(int x:nums){
               if(x==1){
                 contains_one=true;
                  break; 
              }
          }
          if(!contains_one){return 1;}
          int n=nums.length;
          if(n==1) return 2;
          
         for(int i=0;i<n;i++){
                  if(nums[i]<=0 || nums[i]>n) nums[i]=1;
                  } 
                  for(int i=0;i<n;i++){
                      int x=Math.abs(nums[i]);
                      if(nums[x-1]>0) nums[x-1]*=-1;
                      }
            
                 for(int i=0;i<n;i++){
                  if(nums[i]>0) return i+1;
                  } 
            return n+1;
    }
}


// { Driver Code Starts.

class Main
{   
    public static void main (String[] args) 
    {

		Scanner sc=new Scanner(System.in);
		
        //taking testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //input number n
			int n=sc.nextInt();
			int[] arr=new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			System.out.println(missing);
		}
    }
}

  // } Driver Code Ends