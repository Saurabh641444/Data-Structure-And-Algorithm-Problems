class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        
        int n=startTime.length;
        int arr[][]=new int[n][3];
        
        for(int i=0;i<n;i++){
            arr[i][0]=startTime[i];
            arr[i][1]=endTime[i];
            arr[i][2]=profit[i];
        }
        
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        
        Integer dp[]=new Integer[n];
        
        int ans=helper(arr,0,n,dp);
        
        return ans;
        
    }
    
    private int helper(int[][] arr,int i,int n,Integer[] dp){
        if(i==n) return 0;
        
        if(dp[i]!=null) return dp[i];
        
        int notTake=helper(arr,i+1,n,dp);
        
        int Take=arr[i][2]+helper(arr,greaterThan(arr,n,i,arr[i][1]),n,dp);
            
        return dp[i]=Math.max(notTake,Take);
    }
    
    private int greaterThan(int [][] arr,int n,int start,int x){
        int end=n-1;
        int ans=n;
        
        while(end>=start){
            int mid=start+(end-start)/2;
            if(arr[mid][0]>=x){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        
        return ans;
    }
}