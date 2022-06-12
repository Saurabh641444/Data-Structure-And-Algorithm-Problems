class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       int map[]=new int[10001];
       int sum=0;
       int max=0;
       int l=0;
       int r=0;
    
        while(r<nums.length){
            map[nums[r]]++;
            sum+=nums[r];
            
            while(map[nums[r]]>=2){
                map[nums[l]]--;
                sum-=nums[l++];
            }
            
            r++;
            max=Math.max(sum,max);
            
        }
        
        return max;
    }
}