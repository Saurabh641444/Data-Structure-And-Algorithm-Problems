class Solution {
    static List<List<Integer>> lists;
    public List<List<Integer>> subsets(int[] nums) {
        lists =new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(list,nums,0);
        return lists;
    }
    
   public static void solve(List<Integer> list,int[] nums,int curr){
         
         if(curr==nums.length){
                 lists.add(new ArrayList(list));
                  return;
                  }
           
         List<Integer> list2=new ArrayList<>(list);
         list.add(nums[curr]);
         solve(list2,nums,curr+1);
         solve(list,nums,curr+1);
        }
}