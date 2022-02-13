// class Solution {
//     static List<List<Integer>> lists;
//     public List<List<Integer>> subsets(int[] nums) {
//         lists =new ArrayList<>();
//         List<Integer> list=new ArrayList<>();
//         solve(list,nums,0);
//         return lists;
//     }
    
//    public static void solve(List<Integer> list,int[] nums,int curr){
         
//          if(curr==nums.length){
//                  lists.add(new ArrayList(list));
//                   return;
//                   }
           
//          List<Integer> list2=new ArrayList<>(list);
//          list.add(nums[curr]);
//          solve(list2,nums,curr+1);
//          solve(list,nums,curr+1);
//         }
// }

class Solution {
     
    public List<List<Integer>> subsets(int[] nums) {
       
        List<Integer> curr=new ArrayList<Integer>();
        List<List<Integer>> ans=new ArrayList<>();
        dfs(nums,0,curr,ans);
        return ans;
    }
    
   public static void dfs(int[] arr,int i,List<Integer> curr,List<List<Integer>> ans){
         
         if(i==arr.length){
                 ans.add(new ArrayList<Integer>(curr));
                  return;
                  }
           
         
         curr.add(arr[i]);
         dfs(arr,i+1,curr,ans);
         curr.remove(curr.size()-1);
         dfs(arr,i+1,curr,ans);
        }
}