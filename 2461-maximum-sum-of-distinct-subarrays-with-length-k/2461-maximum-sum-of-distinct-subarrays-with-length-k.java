class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
      int dup=0;
      long ans=0;
      int n=nums.length;
      long[] sums=new long[n+1];

      for(int i=1;i<=n;i++){
          sums[i]=sums[i-1]+nums[i-1];
           } 
              
       int[] freq=new int[100001];

       for(int i=0;i<k;i++){
         freq[nums[i]]++;
         if(freq[nums[i]]==2) dup++; 
        }

        if(dup==0){
            ans=sums[k];
          }       
         
       for(int i=k;i<n;i++){

          freq[nums[i-k]]--;
         if(freq[nums[i-k]]==1) dup--;
           
          freq[nums[i]]++;

          if(freq[nums[i]]==2) dup++;

           if(dup==0){
            ans=Math.max(ans,sums[i+1]-sums[i-k+1]);
          }

         }        

      return ans;       

    }
    

}