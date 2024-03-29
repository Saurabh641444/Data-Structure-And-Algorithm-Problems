//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<n;i++){
            hm.put(x[i],b[i]);
        }
        
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
       
       StringBuilder ans=new StringBuilder();
       StringBuilder temp=new StringBuilder();
        
        for(char ch:w.toCharArray()){
           
           if(hm.containsKey(ch)){
               currSum+=hm.get(ch);
           }else{
               currSum+=(int)ch;
           }    
           
           temp.append(ch);
           
           if(currSum>maxSum){
              maxSum=currSum;
               ans=new StringBuilder(temp);
           }
        //   System.out.println(res);
           if(currSum<0){
               currSum=0;
               temp=new StringBuilder();
           }
           
           
           
           
        }
        return ans.toString();
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends