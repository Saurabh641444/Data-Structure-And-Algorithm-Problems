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
    
    public int maxProduct(TreeNode root) {
        
        long ans=0;
        totalSum=0;
        int mod=1000_000_007;
        HashMap<TreeNode,Long> hm=new HashMap<>();
        totalSum= dfs(root,0,hm);
       
        // System.out.println(totalSum+" *");
        for(Map.Entry<TreeNode , Long> e:hm.entrySet()){
            TreeNode node=e.getKey();
            long currSum=e.getValue();
            // System.out.println(node.val+" "+currSum);
            ans=Math.max(ans,currSum*(totalSum-currSum));
        }
        
        // helper(root,hm,ans);
        
        return (int)((ans%mod));
    }
    
   
    
    public long dfs(TreeNode root,long currSum,HashMap<TreeNode,Long> hm){
        if(root==null){
            return 0;
        }
        
        
                  currSum=dfs(root.left,currSum,hm)+root.val+dfs(root.right,currSum,hm);
        totalSum=currSum+totalSum;
        hm.put(root,currSum);
        return currSum;
    }
}