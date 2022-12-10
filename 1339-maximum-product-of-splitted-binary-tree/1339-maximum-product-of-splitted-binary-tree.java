/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long totalSum;
    ArrayList<Long> arr=new ArrayList<>();
    public int maxProduct(TreeNode root) {
        
        long ans=0;
        totalSum=0;
        int mod=1000_000_007;
        // HashMap<TreeNode,Long> hm=new HashMap<>();
        totalSum= dfs(root,arr);
       
        // System.out.println(totalSum+" *");
        // for(Map.Entry<TreeNode , Long> e:hm.entrySet()){
        //     TreeNode node=e.getKey();
        //     long currSum=e.getValue();
        //     // System.out.println(node.val+" "+currSum);
        //     ans=Math.max(ans,currSum*(totalSum-currSum));
        // }
        
        // helper(root,hm,ans);
        
        for(int i=0;i<arr.size();i++){
            ans=Math.max(ans,(totalSum-arr.get(i))*arr.get(i));
        }
        
        return (int)((ans%mod));
    }
    
   
    
    public long dfs(TreeNode root,ArrayList<Long> arr){
        if(root==null){
            return 0;
        }
        
        
                  long currSum=dfs(root.left,arr)+root.val+dfs(root.right,arr);
        arr.add(currSum);
        return currSum;
    }
}