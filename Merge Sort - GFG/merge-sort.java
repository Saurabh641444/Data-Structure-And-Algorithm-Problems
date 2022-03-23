// { Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}


// } Driver Code Ends




class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int left[]=Arrays.copyOfRange(arr,l,m+1);
         int right[]=Arrays.copyOfRange(arr,m+1,r+1);
         
         int a=0,b=0,s=l;
         
         while(a<left.length && b<right.length){
             if(left[a]<right[b]) arr[s++]=left[a++];
             else arr[s++]=right[b++];
         }
         while(a<left.length) arr[s++]=left[a++];
         while(b<right.length) arr[s++]=right[b++];
         
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l==r){return;}
        
        int m=(l+r)/2;
        
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
        
    }
}
