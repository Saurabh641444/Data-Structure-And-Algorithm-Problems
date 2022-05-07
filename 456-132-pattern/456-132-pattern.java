class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        
       int min[]=new int[nums.length];
        
        min[0]=nums[0];
        
       for(int i=1;i<nums.length;i++){
           min[i]=Math.min(min[i-1],nums[i]);
       }
        
      for(int i=nums.length-1;i>=0;i--){
          
          while(!st.isEmpty()&&st.peek()<=min[i]){
              st.pop();
          }
          
          if(!st.isEmpty()&&st.peek()<nums[i]){
              return true;
          }
          
          st.push(nums[i]);
      }
            
     return false;
    }
}