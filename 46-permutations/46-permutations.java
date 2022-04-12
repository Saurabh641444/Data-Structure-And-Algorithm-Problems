class Solution {
    List<List<Integer>> ans=new ArrayList<>();
   
    public List<List<Integer>> permute(int[] nums) {
         List<Integer> ip=new ArrayList<>();
     List<Integer> op=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            ip.add(nums[i]);
        }
       
        solve(nums,op);
        return ans;
    }
    public void solve(int[] nums,List<Integer> op) {
        if(nums.length==op.size()){ 
            ans.add(new ArrayList<>(op));
            return;
        }
       
        for(int i=0;i<nums.length;i++){
            
            if(!op.contains(nums[i])){
            op.add(nums[i]);
            solve(nums,op);
            op.remove(op.size()-1);
            }
        }
            
        
    }
}