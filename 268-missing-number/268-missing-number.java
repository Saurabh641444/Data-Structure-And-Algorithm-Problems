/*class Solution {
    public int missingNumber(int[] nums) {
      boolean arr[]=new boolean[nums.length+1];
        
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=true;
        }
        
            for(int i=0;i<nums.length+1;i++){
               if(arr[i]==false){ return i;}
        }
        
        return 0;
    }
}*/

class Solution {
    public int missingNumber(int[] nums) {
      int miss=nums.length;
        for(int i=0;i<nums.length;i++){
            miss=miss^nums[i]^i;
        }
        
        return miss;
    }
}