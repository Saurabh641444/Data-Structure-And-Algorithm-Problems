/*class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1) return true;
        if(nums.length==2 &&nums[0]==nums[1]) return true;
        boolean ans=false;
       if(nums[0]>nums[1]){
        
           if(nums.length==2){ return true;}
             ans= decrease(nums);
       }else if(nums[0]<nums[1]){
           if(nums.length==2){ return true;}
           ans=increase(nums);
       }else if(nums[0]==nums[1]){
              if(nums[1]<nums[2]){
                  ans=increase(nums); 
              }else if(nums[1]>nums[2]){
                 ans= decrease(nums); 
              }
              ans=allSame(nums);
       }
        
        return ans;
    }
    
    public static boolean allSame(int[] nums){
        for(int i=1;i<nums.length;i++){
             if(nums[i-1]!=nums[i]){
                 return false;
             }
        }
        return true;
    }
    
    public boolean decrease(int[] nums){
        for(int i=1;i<nums.length;i++){
             if(nums[i-1]<nums[i]){
                 return false;
             }
        }
        return true;
    }
    
     public boolean increase(int[] nums){
        for(int i=1;i<nums.length;i++){
             if(nums[i-1]>nums[i]){
                 return false;
             }
        }
         return true;
    }
}*/

class Solution {
    public boolean isMonotonic(int[] nums) {
     boolean isIncreasing=true,isDecreasing=true;
        for(int i=1;i<nums.length;i++){
             if(nums[i-1]>nums[i]){
                 isIncreasing=false;
             }
             if(nums[i-1]<nums[i]){
                 isDecreasing=false;
             }
        }
        return isIncreasing || isDecreasing;
    }
}