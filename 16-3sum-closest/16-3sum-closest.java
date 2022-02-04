// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         int n=nums.length;
//         int count=0;
//         Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n-2;j++){
//                 for(int k=j+1;k<n-3;k++){
//                     if(nums[i]+nums[j]+nums[k]==target-1  ){
//                         count++;
//                     }
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length;
       int result=nums[0]+nums[1]+nums[n-1];
        Arrays.sort(nums);
       for(int i=0;i<n-2;i++){
       int a_pointer=i+1;
       int b_pointer=n-1;

       while(a_pointer<b_pointer){
           int current_sum=nums[i]+nums[a_pointer]+nums[b_pointer];
           if(current_sum>target){
            b_pointer-=1;
               }else{
                a_pointer+=1;
                }

          if(Math.abs(current_sum-target)<Math.abs(result-target)){
                   result=current_sum;
             }
          }
        }
return result;
    }
}