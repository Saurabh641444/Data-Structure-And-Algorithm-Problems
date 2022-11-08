//{ Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        
        boolean[] prev=new boolean[sum+1];
        
        prev[0]=true;
        if(arr[0]<=sum)
            prev[arr[0]]=true;
        
        for(int ind=1;ind<N;ind++){
             boolean[] temp=new boolean[sum+1];
             temp[0]=true;
            for(int target=1;target<=sum;target++){
                
              
                boolean take=false;
                
              
              boolean   notTake=prev[target];
                
                
                if(target>=arr[ind] ){
                   take=prev[target-arr[ind]];
                  }
        
                 temp[target]= notTake || take; 
                
            }
            prev=temp.clone();
        }
        
        return prev[sum];
       
       /* boolean[][] dp=new boolean[N+1][sum+1];
        
        for(int i=0;i<N;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=sum)
            dp[0][arr[0]]=true;
        
        for(int ind=1;ind<N;ind++){
            for(int target=1;target<=sum;target++){
                
              
                boolean take=false;
                
              
              boolean   notTake=dp[ind-1][target];
                
                
                if(target>=arr[ind] ){
                   take=dp[ind-1][target-arr[ind]];
                  }
        
                 dp[ind][target]= notTake || take; 
                
            }
        }
        
        return dp[N-1][sum];*/
        // int dp[][]=new int[N+1][sum+1];
        
        // for(int a[]:dp){
        //     Arrays.fill(a,-1);
        // }
        
        // return isSubsetSumHelper(arr,N-1,sum,dp);
    }
    
    static boolean isSubsetSumHelper(int arr[],int i, int target,int dp[][]){
        
        if(i==0) return arr[i]==target;
        
        if(0==target){
            return true;
        }
        
        if(dp[i][target]!=-1) return dp[i][target]==1?true:false;
        
        boolean notTake=isSubsetSumHelper(arr,i-1,target,dp);
        boolean take=false;
        
        if(target>=arr[i]){
            take=isSubsetSumHelper(arr,i-1,target-arr[i],dp);
        }
        
       boolean ans= notTake || take;
       
       if(ans==true){
           dp[i][target]=1;
       }else{
        dp[i][target]=0;
       }
       return ans;
    }
    
}
