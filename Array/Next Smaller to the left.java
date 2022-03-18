/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    private static void NSL(int[] arr,int n){
    ArrayList<Integer> list=new ArrayList<>();
    Stack<Integer> st=new Stack<>();
    
    for(int i=0;i<n;i++){
        if(st.isEmpty()){
            list.add(-1);
        }
        else if(!st.isEmpty() && st.peek()<arr[i]){
            list.add(st.peek());
        }else if(!st.isEmpty() && st.peek()>arr[i]){
            while(!st.isEmpty() && st.peek()>arr[i]){st.pop();}
            if(st.isEmpty()){
            list.add(-1);
        }
        else if(!st.isEmpty() && st.peek()<arr[i]){
            list.add(st.peek());
        }
        }
        st.push(arr[i]);
    }
    
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }
    
}
   
   

	public static void main (String[] args) {
// 		System.out.println("GfG!");

     int [] arr=new int[]{4,5,2,10,8};
		NSL(arr,arr.length);
	}
}
