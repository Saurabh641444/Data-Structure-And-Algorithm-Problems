import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		int arr[]={1,2,3};
	
	    solve(arr,0,0);
	}
	
	private static void solve(int arr[],int start,int end){
	    
	    if(end==arr.length){ return;}
	    else if(start>end){ solve(arr,0,end+1);}
	    else{
	        System.out.println("[");
	        for(int i=start;i<end;i++){
	             System.out.println(arr[i]+" ");
	            
	        }
	        
	        System.out.println(arr[end]+"]");
	        solve(arr,start+1,end);
	    }
	    return;
	}
}
