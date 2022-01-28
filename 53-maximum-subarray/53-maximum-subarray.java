// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum=0;
//         int maximum=nums[0];
        
//         for(int num:nums){
//             sum+=num;
//                maximum=Math.max(sum,maximum);
        
//         if(sum<0){sum=0;}
//         }
     
//         return maximum;
//     }
// }

class Solution {
//solution by Kadane's algorithm
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0; 
        if(nums.length==1)  return nums[0];

        int local_max=0;
        int global_max=Integer.MIN_VALUE;
       
        for(int i=0; i<nums.length;i++){
        local_max=Math.max(nums[i],nums[i]+local_max);

         if(global_max<local_max){
            global_max=local_max;
            }
          }
        
        return global_max;
    }
}