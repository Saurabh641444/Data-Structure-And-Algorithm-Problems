class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int r=nums.length-1;
        
        while(l<r){
            if(nums[l]%2==1){
                if(nums[r]%2==0){
                    int temp=nums[r];
                    nums[r]=nums[l];
                    nums[l]=temp;
                }else{
                    r--;
                }
            }else{
                l++;
            }
        }
        
        return nums;
    }
}