class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] res=new int[]{-1,-1};
       
        for(int i=0;i<n;i++){
            if(nums[i]==target){
               if(res[0]!=-1){
                   res[1]=i;
               }else{
                   res[0]=i;
                   res[1]=i;
               }
            }
        }
        
      
        return res;
    }
}

