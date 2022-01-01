import java.util.Arrays;

class Solution {
    public boolean canPartition(int[] nums) {
      int sum=0;
       int N=nums.length;
        for(int i=0;i<N;i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0){return false;}
     
        else{return isSubsetSum(N,nums,sum/2);}
    }
     static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] t=new boolean[N+1][sum+1];
        for(int i=0;i<=N;i++){ t[i][0]=true;}
            for(int i=1;i<=sum;i++){
              
                t[0][i]=false;
            }
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[N][sum];
       
    }
}