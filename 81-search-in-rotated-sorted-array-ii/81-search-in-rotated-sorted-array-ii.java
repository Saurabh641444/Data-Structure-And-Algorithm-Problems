/* TC O(N+NlogN) SC O(!)
class Solution {
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           if(nums[i]==target){
               return true;
           } 
        }
        
        return false;
    }
}
*/

class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        Arrays.sort(nums);
        while(l<=r){
            mid=l+(r-l)/2;
            
            if(nums[mid]==target){
                return true;
            }else if(nums[mid]>target){
                r=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }
        }
        
        return false;
    }
}