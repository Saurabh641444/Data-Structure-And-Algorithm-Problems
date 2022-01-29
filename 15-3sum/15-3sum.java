class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
       List<List<Integer>> res= new ArrayList<List<Integer>>();
       List<Integer> temp=new ArrayList<Integer>();
      
       int len=nums.length;

       if(len<3) return res;
      int left=1;
      int right=len-1;
      int diff=0;
   
        for(int i=0;i<len-2;i++){
     if(i>0 && (nums[i]==nums[i-1])) continue;
     left=i+1;
     right=len-1;
     diff=0-nums[i];
     int lval=Integer.MIN_VALUE;
     int rval=Integer.MAX_VALUE;
     
     while(left<right){
     if((nums[left]+nums[right])==diff && nums[left]!=lval && nums[right]!=rval){
         temp=new ArrayList<Integer>();
         temp.add(nums[i]);
         temp.add(nums[left]);
         temp.add(nums[right]);
         lval=nums[left];
         rval=nums[right];
         left++;
         right--;
 res.add(temp);       

}
       else if((nums[left]+nums[right])<diff){
           left++;
            }
else{
 right--;
  }
          }
         }

        return res;
        
    }
}



// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
        
//        Set<List<Integer>> res= new HashSet<>();
//        if(nums.length==0) return new ArrayList<>(res);

//        Arrays.sort(nums);
       
//       for(int i=0;i<nums.length-2;i++){
//          int j=i+1;
//          int k=nums.length-1;
//          while(j<k){
//               int sum=nums[j]+nums[k];
//               if(sum==nums[i]){ res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));}
//               else if (sum>-nums[i]) k--;
//               else if(sum<-nums[i]) j++;
//             }
//       }
     
//      return new ArrayList<>(res);
//     }
// }