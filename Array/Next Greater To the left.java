/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
    
    private static void NGL(int[] arr,int n){
    ArrayList<Integer> list=new ArrayList<>();
    Stack<Integer> st=new Stack<>();
    
    for(int i=0;i<n;i++){
        if(st.isEmpty()){
            list.add(-1);
        }
        else if(!st.isEmpty() && st.peek()>arr[i]){
            list.add(st.peek());
        }else if(!st.isEmpty() && st.peek()<arr[i]){
            while(!st.isEmpty() && st.peek()<arr[i]){st.pop();}
            if(st.isEmpty()){
            list.add(-1);
        }
        else if(!st.isEmpty() && st.peek()>arr[i]){
            list.add(st.peek());
        }
        }
        st.push(arr[i]);
    }
    
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }
    
}
	private static void NGL2(int[] arr,int n){
       TreeSet<Integer> ts=new TreeSet<>();
       for(int i=0;i<n;i++){
           Integer c=ts.ceiling(arr[i]);
           
           if(c==null){
               System.out.print(-1+" ");
           }
           else{
               System.out.print(c+" "); 
           }
           ts.add(arr[i]);
       }
   }


	public static void main (String[] args) {
// 		System.out.println("GfG!");

     int [] arr=new int[]{1,3,2,4};
		NGL(arr,arr.length);
		NGL2(arr,arr.length);
	}
}
