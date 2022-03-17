class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] nge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){st.push(nums[i]);}
        for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && st.peek()<=nums[i]){st.pop();}
                int v=nums[i];
                nums[i]=(st.isEmpty())?-1:st.peek();
            
            st.push(v);
            
        }
      
        
        return nums;
        
    }
}