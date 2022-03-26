class Solution {
    public int search(int[] nums, int target) {
        int mid=nums.length/2;
        
        if(nums[mid]==target){ return mid;}
        else if(nums[mid]<target){
            for(int i=mid;i<nums.length;i++){
                if(nums[i]==target){
                    return i;
                }
            }
        }
        else if(nums[mid]>target) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    return i;
                }
            }
        }
            return -1;
        
    }
}