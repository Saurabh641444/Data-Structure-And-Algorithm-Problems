/*package whatever //do not write package name here */

import java.io.*;
import java.util.HashMap;

class GFG {
	public static void main (String[] args) {
		int arr[]={1, 1, 1, 1,1,-1,1,90,1};
		int n=arr.length;
		int k=3;
		morethanNdk(arr,n,k);
// 		move(arr,n);
// 		for(int a:arr){
// 	        System.out.print(a+" ");
// 	    }
	}
	
	public static void morethanNdk(int arr[],int N,int k){
	    
	    int x=N/k;
	    
	    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	    for(int i=0;i<N;i++){
	        
	        if(!map.containsKey(arr[i])){
	            map.put(arr[i],1);
	        }else{
	            int count=map.get(arr[i]);
	            map.put(arr[i],count+1);
	        }
	        
	        for(HashMap.Entry m:map.entrySet()){
	            Integer temp=(Integer) m.getValue();
	            if(temp>x){
	                System.out.println(m.getKey());
	            }
	        }
	        
	    }
	}
	public static void swap(int[] arr, int i,int j){
	   int temp=0;
      
                          temp=arr[i];
                          arr[i]=arr[j];
                          arr[j]=temp;
              
	}
	
                 public static void move(int[] arr,int n){
                    int low=0;
                    int high=arr.length-1;
                     
                    while(low<=high){
                          if(arr[low]<=0){low++;}
                            else{
                                swap(arr,low,high--);
                              }
                     }

                 }
}
