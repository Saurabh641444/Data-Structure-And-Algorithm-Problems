class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        
        subsetWithDupHelper(nums,0,ans,new ArrayList<>());
       
        return ans;
    }
    
    private void subsetWithDupHelper(int[] nums,int index,List<List<Integer>> ans,ArrayList<Integer> ds){
        ans.add(new ArrayList<>(ds));
        
        for(int i=index;i<nums.length;i++){
        
            if(i!=index && nums[i]==nums[i-1]) continue;
            
        ds.add(nums[i]);
        subsetWithDupHelper(nums,i+1,ans,ds);
        ds.remove(ds.size()-1);
        }
        
    }
    
   /* private void subsetWithDupHelper(int[] nums,int index,List<List<Integer>> ans,ArrayList<Integer> ds){
        if(index==nums.length){
            if(ans.contains(ds)==false){
            ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        
       subsetWithDupHelper(nums,index+1,ans,ds);
        ds.add(nums[index]);
        subsetWithDupHelper(nums,index+1,ans,ds);
        ds.remove(ds.size()-1);
       
        
    }*/
}