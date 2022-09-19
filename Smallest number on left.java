//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a1[] = in.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for(int i = 0;i < n;i++)
                a[i] = Integer.parseInt(a1[i]);
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.leftSmaller(n, a);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        /*
        
        if stack is empty -> push add -1
        if arr[i]<st.peek() add element in vector
        if(arr[i]>=st.peek()) pop till arr[i]>st.peek()
        ---
        
        1 6 2
        
        add -1
        push 1
        a[i]>st.peek()
        add 1
        push 6
        
        
      
        
        List<Integer> ans=new ArrayList<>();
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<n;i++){
            
            if(st.isEmpty()){
               ans.add(-1);// -1
            }
            else if(!st.isEmpty() && a[i]>st.peek()){
                ans.add(st.peek());// 1
                
            }else if(!st.isEmpty() && a[i]<=st.peek()) {
                while(!st.isEmpty() && a[i]<=st.peek()){
                    st.pop();
                }
                
               if(st.isEmpty()){
                  ans.add(-1);
               }else if(!st.isEmpty() && a[i]>st.peek()){
                  ans.add(st.peek());
               }
                
           }
            
             st.push(a[i]);// 1
        }
        
        return ans;
        
    }
}*/


class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
       
        
        List<Integer> ans=new ArrayList<>();
        
        int min=-1;
        
        ans.add(-1);
        
        int min_left=a[0];
        
        for(int i=1;i<n;i++){
            if(min_left<a[i]){
                
                 ans.add(min_left);
                 min_left=a[i];
                 
            }else {
                int j=i-1;
                
                while(j>=0 && min_left>=a[i]){
                    min_left=a[j--];
                }
                
                if(min_left<a[i]){
                    ans.add(min_left);
                }
                else{
                    ans.add(-1);
                }
                
                min_left=a[i];
                
            }
           
           
        }
        
        return ans;
        
    }
}
