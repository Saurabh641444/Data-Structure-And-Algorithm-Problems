/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    static Stack<Integer> st=new Stack<Integer> ();
    private static void sort(int arr[],int n){
        
        
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        }
        
        sortStack(st);
        
       
        
    }
    
    private static void sortStack(Stack<Integer> st){
        if(st.size()==1) return;
        
        int temp=st.peek();
        st.pop();
        sortStack(st);
        insert(st,temp);
         
        
    }
    
    static void insert(Stack<Integer> st,int temp){
        if(st.size()==0|| st.peek()>=temp){
            st.push(temp);
            return;
        }
        
        int val=st.peek();
        st.pop();
        insert(st,temp);
        
        st.push(val);
        
       
    }
  
	public static void main (String[] args) {
// 		System.out.println("GfG!");

     int [] arr=new int[]{1,3,2,4};
		sort(arr,arr.length);
		
		while(!st.isEmpty()){
		    System.out.println(st.peek());
		    st.pop();
		}
		
		
	}
}
