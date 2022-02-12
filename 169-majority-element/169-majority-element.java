class Solution {
    public int majorityElement(int[] nums) {
       //Arrays.sort(nums);
       //return nums[nums.length/2];
       int maj=nums[0];
       int c=1;
       for(int i=1;i<nums.length;i++){
            if(maj==nums[i]){c++;}
            else{c--;}
            if(c==0){

               maj=nums[i];
               c=1;
                }
               }
         return maj;
    }
}