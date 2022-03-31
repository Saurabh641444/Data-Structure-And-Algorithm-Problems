class Solution {
    public int splitArray(int[] nums, int m) {
        
       int max=0;
       int sum=0;
       for(int val:nums){
           sum+=val;
           max=Math.max(max,val);
           }
         if(m==nums.length){
           return max;}
      int low= max;
     int high=sum;
     int ans=0;
    
      while(low<=high){
           int mid=low+(high-low)/2;
           if(isPossible(nums,mid,m)==true){
                 ans=mid;
                 high=mid-1;
           }else{
              low=mid+1;
             }
           }
       return ans;
    }

    public static boolean isPossible(int [] arr,int mid,int m){
           int sa=1;
           int sum=0;
         
          for(int i=0;i<arr.length;i++){

             sum+=arr[i];
         
             if(sum>mid){
                  sa++;
                  sum=arr[i];
                }
              }

           return sa<=m;
        }
}