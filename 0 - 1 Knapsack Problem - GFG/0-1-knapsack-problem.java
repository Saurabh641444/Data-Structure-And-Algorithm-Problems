// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends



// class Solution 
// { 
    
//     //Function to return max value that can be put in knapsack of capacity W.
//     static int knapSack(int W, int wt[], int val[], int N) 
//     {        // code here
//         int[][] t=new int[N+1][W+1];
//         for(int i=0;i<=N;i++){ t[i][0]=0;}
//             for(int i=1;i<=W;i++){
              
//                 t[0][i]=0;
//             }
        
//         for(int i=1;i<=N;i++){
//             for(int j=1;j<=W;j++){
//                 if(wt[i-1]<=j){
//                     t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]);
//                 }
//                 else{
//                     t[i][j]=t[i-1][j];
//                 }
//             }
//         }
//         return t[N][W];
//     } 
// }

class Solution 
{ 
    
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int N) 
    {        // code here
        int[][] t=new int[N+1][W+1];
        for(int i=0;i<=N;i++){ 
            for(int j=0;j<=W;j++){
              
                t[i][j]=-1;
            }}
        return Memo(W,wt,val,N,t);
    } 
   
 static int Memo(int W,int wt[],int val[],int N, int t[][]){
      if(N==0||W==0) return 0;

     if(t[N][W]!=-1){
       return t[N][W];
        }
       
    if(wt[N-1]<=W){
          return t[N][W]=Math.max(val[N-1]+Memo(W-wt[N-1],wt,val,N-1,t),Memo(W,wt,val,N-1,t));
     }
else{
    return t[N][W]=Memo(W,wt,val,N-1,t);
   }

    }
   
}