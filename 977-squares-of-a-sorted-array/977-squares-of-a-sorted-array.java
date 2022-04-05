class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int counter=end;
          int [] ans=new int[n];
        while(start<=end){
            if( nums[start]*nums[start]>nums[end]*nums[end]){
                ans[counter]=nums[start]*nums[start];
                counter--;
                start++;
            }else{
                ans[counter]=nums[end]*nums[end];
                counter--;
                end--;
            }
        }
     
        return ans;
    }
}