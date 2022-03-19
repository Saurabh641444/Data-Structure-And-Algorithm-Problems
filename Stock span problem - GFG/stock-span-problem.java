// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends

 public class Pair{
        
        int key;
        int value;
        Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

class Solution
{
   
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
    
    Stack<Pair> st=new Stack<Pair>();
    // ArrayList<Integer> list=new ArrayList<>();
    int[] ans=new int[n];
    for(int i=0;i<n;i++){
        if(st.isEmpty()){
        ans[i]= i+1;
        }
        else if(!st.isEmpty() && st.peek().value>price[i]){
            ans[i]=i-st.peek().key;
        }else if(!st.isEmpty() && st.peek().value<=price[i]){
            while(!st.isEmpty() && st.peek().value<=price[i]){st.pop();}
            if(st.isEmpty()){
             ans[i]= i+1;
        }
        else if(!st.isEmpty() && st.peek().value>price[i]){
             ans[i]=i-st.peek().key;
        }
        }
        Pair p=new Pair(i,price[i]);
        st.push(p);
    }
    
    
    // for(int i=0;i<n;i++){
    //     ans[i]=list.get(i);
    // }
    
    return ans;
    
    }
    
}