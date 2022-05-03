class Solution {
    public int findUnsortedSubarray(int[] nums) {
       int n=nums.length;
     int left=0;
        // Step 1: Find first out of place numbers from left
       while(left+1<n && nums[left]<=nums[left+1]){
           left++;
       }
        
        // return 0 if array is sorted
        if(left==n-1){ return 0;}
        
        int right=n-1;
        // Step: 2 Find first out of place number from right
        while(right>=1&& nums[right]>=nums[right-1]){
            right--;
        }
        
        // step3: Find out min and maximum numbewr between misplaced number range
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i=left;i<=right;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        
        //Step4: 
        while(left>=1 && nums[left-1]>min){
       left--;
    }
      while(right+1<n && nums[right+1]<max){
        right++;
    }
        return right-left+1;
        
    }
}