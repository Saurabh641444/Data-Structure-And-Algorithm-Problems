/*class Solution {
    List<List<Integer>> ans=new ArrayList<>();
   
    public List<List<Integer>> permute(int[] nums) {
       
     List<Integer> op=new ArrayList<>();
       
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
*/

// Approach - 2
/*
                                                                                                                        [1,2,3]
                                                                                                                        /  |   \
                                                                                                                      /    |     \
                                                                                                                    /      |      \
                                                                                    swap                   (1,1)  /     (2,1)   \ (3,1)
                                                                                                           |                |           |
                                                                                                     [ 1,  2 , 3]       [2 ,1 ,3]       [3, 1, 2]
                                                                                                      /         \
                                                                                                   (2,2)        (3,2)
                                                                                                    |                |
                                                                                                   [1,2,3]      [1,3,2] 
                                                                                                     |                |
                                                                                                   (3,3)           return [1,3,2]
                                                                                                     |                     
                                                                                                return [1,2,3] 


*/

class Solution {
 
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>(); 
         recurPermute(0,nums,ans);
         return ans;
    }

    private void  recurPermute(int index,int[] nums, List<List<Integer>> ans)      {
        if(nums.length==index){ 
             List<Integer> ds=new ArrayList<>();
             for(int i=0;i<nums.length;i++){
                 ds.add(nums[i]);
                 }
            ans.add(new ArrayList<>(ds));
            return;
        }
       
        for(int i=index;i<nums.length;i++){
            
            swap(i,index,nums);
            recurPermute(index+1,nums,ans);
            swap(i,index,nums);
         
        }
             
    }

   private void swap(int x,int y,int nums[]){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}