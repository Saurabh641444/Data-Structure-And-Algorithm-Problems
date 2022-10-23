//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            int  M = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            int ans = ob.steppingNumbers(N, M);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    int steppingNumbers(int n, int m){
        // code here
        /*
        10 , 11, 12, 13, 14, 15
        stepping number 10,12
        
        */
       int ans=0;
        
        if(n==0) ans++;
        
        // for(int i=1;i<=9;i++){
        //     dfs(i,n,m);
        // }
        
        Queue<Integer> q=new LinkedList<>();
        
        for(int i=1;i<=9;i++){
            q.add(i);
        }
        
        while(q.size()>0){
            int size=q.size();
            
            while(size-->0){
                int num=q.poll();
                
                if(num<=m && num>=n) ans++;
                
                int lastDigit=num%10;
                
                if(lastDigit==9){
                    int next=num*10+8;
                    
                    if(next<=m ) q.add(next);
                     
                }else if(lastDigit==0){
                    int next=num*10+1;
                    
                    if(next<=m ) q.add(next);

                }else{
                    int smaller=num*10+(lastDigit-1);
                    
                    if(smaller<=m ) q.add(smaller);
                    
                    int greater=num*10+(lastDigit+1);
                    
                    if(greater<=m ) q.add(greater);
                }
            }
        }
        
        return ans;
    }
    
    void dfs(int curr,int n,int m){
        
        if(curr>m) return;
    
        // if(curr<=m && curr>=n) ans++;    
        int lastDigit=curr%10;
        
        if(lastDigit==9){
            dfs(curr*10+8,n,m);
        }else if(lastDigit==0){
            dfs(curr*10+1,n,m);
        }else{
            dfs(curr*10+(lastDigit+1),n,m);
            dfs(curr*10+(lastDigit-1),n,m);
        }
    }
}
