import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int[] solve(int arr[]){
       int k=arr.length-1;
	  
	  for(int i=0;i<=k;i++){
	      int temp=arr[k];
	      arr[k]=arr[i];
	      arr[i]=temp;
	      k--;
	  }
	  
	  return arr;
     }
     
	public static void main (String[] args)
	 {
	 //code
	  Scanner sc=new Scanner(System.in);
	  int t=sc.nextInt();
	  
	  for(int j=0;j<t;j++){
	  int n=sc.nextInt();
	  
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++){
	      arr[i]=sc.nextInt();
	  }
	      int newArr[]=solve(arr);
	      
	       for(int k=0;k<n;k++){
	      System.out.print(newArr[k]+" ");
	  }
	   System.out.println();
	  }
	  
	  
	 
	 }
}