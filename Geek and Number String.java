//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t > 0){
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            Solution ob = new Solution();
            System.out.println(ob.minLength(s, n));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution { 
    public int minLength(String s, int n) { 
    	// code here 
    	
    	Stack<Integer> st=new Stack<>();
    	
    	for(char c:s.toCharArray()){
    	    int x=c-'0';
    	    
    	    if(st.isEmpty()){
    	        st.add(x);
    	    }else if((st.peek()==0 && x==9)||(st.peek()==9 && x==0)){
    	        st.pop();
    	    }else if(st.peek()%2==0 && st.peek()==x+1){
    	        st.pop();
    	    }else if(st.peek()%2!=0 && st.peek()==x-1){
    	        st.pop();
    	    }else{
    	        st.add(x);
    	    }
    	}
    	
    	return st.size();
    	
    }
}Geek and Number String
