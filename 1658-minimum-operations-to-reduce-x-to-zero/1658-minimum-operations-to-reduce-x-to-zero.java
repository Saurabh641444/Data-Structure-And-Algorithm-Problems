class Solution {
    public int minOperations(int[] nums, int x) {
      
        int target=-x;
        for(int num:nums){
            target+=num;
        }
        
        if(target==0) return nums.length;
        if(target<0) return -1;
        
        int max=0;
        int sum=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>target){
                sum-=nums[j++];
            }
            
            if(sum==target){
                max=Math.max(max,i-j+1);
            }
        }
        
        return max>0?nums.length-max:-1;
    }
}