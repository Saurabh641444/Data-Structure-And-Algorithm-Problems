class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        
        int l=0;
        int r=1;
        int count=0;
        while(r<nums.length){
            int diff=nums[r]-nums[l];
              if(diff<=k){ r++;}
              else{
                  l=r;
                  r=r+1;
                  count++;
              }
        }
        count++;
        return count;
    }
}