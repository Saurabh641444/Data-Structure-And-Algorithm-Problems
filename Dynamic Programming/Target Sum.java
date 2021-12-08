class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
         int ArrSum=0;
     for(int i=0;i<n;i++){
      ArrSum+=nums[i];
       }
if(((ArrSum - target) % 2 != 0) || (target > ArrSum)){
           return 0;}
    int sum=(ArrSum-target)/2;
    return perfectSum(nums,n, sum) ;

    }
    private static int perfectSum(int arr[],int N, int sum) 
	{ 
	    // Your code goes here
	            // code here
        int[][] t=new int[N+1][sum+1];
        for(int i=0;i<N+1;i++){ t[i][0]=1;}
            for(int i=1;i<sum+1;i++){
              
                t[0][i]=0;
            }
        
        for(int i=1;i<N+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]>j||(arr[i-1]==0)){//confuse
                   
                    t[i][j]=t[i-1][j];
                }
                else{
                   t[i][j]=(t[i-1][j-arr[i-1]] + t[i-1][j]);
                }
                //      if(arr[i - 1] <= j){
                //     t[i][j] = t[i-1][j] + t[i - 1][j - arr[i - 1]];
                //      }
                // else{
                //     t[i][j] = t[i - 1][j];
                // }
                //
//arr[]=[9,7,0,3,9,8,6,5,7,6]
//target=2
                }
        }
        int count=0;
for(int x:arr){
    if(x==0){
        count++;  
        }
     }
    return(int)(Math.pow(2,count))*t[N][sum];
       
	} 
  }

        
        
