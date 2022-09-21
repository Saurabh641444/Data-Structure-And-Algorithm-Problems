class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int pre_sum=0;
        
        for(int num:nums){
            if(num%2==0){
                pre_sum+=num;
            }
        }
        
       int ans[]=new int[nums.length];
        
        for(int i=0;i<queries.length;i++){
          if(queries[i][1]<nums.length){
              int prev=nums[queries[i][1]];
            nums[queries[i][1]]+=queries[i][0];
              int curr=nums[queries[i][1]];
                                System.out.println(prev+" "+curr);

              if(curr%2==0 && prev%2==0){
                  ans[i]=pre_sum-prev+curr;
                  pre_sum=pre_sum-prev+curr;  
              }else if(curr%2==0 && prev%2!=0){
                  ans[i]=pre_sum+curr;
                  pre_sum=pre_sum+curr;
              }else if(curr%2!=0 && prev%2==0){
                  ans[i]=pre_sum-prev;
                  pre_sum-=prev;
              }else{
                 ans[i]=pre_sum; 
              }
              
              
              }else{
              ans[i]=pre_sum;
            }
        }
        
        return ans;
       
    }
}