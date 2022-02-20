class Solution {
    public int removeDuplicates(int[] nums) {
    //     int i=0;
    //     for(int e:nums){
    //     if(i==0 || i==1 || nums[i-2]!=e){
    //       nums[i]=e;
    //       i+=1;
    // }
    //       }
    //    return i;//spacevO(1)
        int index=2;
for(int i=2;i<nums.length;i++){
if(nums[i]!=nums[index-2]){nums[index++]=nums[i];}
}

return index;
    }
}