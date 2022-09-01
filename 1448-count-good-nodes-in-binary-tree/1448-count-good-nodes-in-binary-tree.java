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
    public int goodNodes(TreeNode root) {
        int min=Integer.MIN_VALUE;
        
        int ans[]=new int[1];
        dfs(root,min,ans);
        
        return ans[0];
    }
    
    private void dfs(TreeNode root,int min,int [] ans){
        
        if(root==null){
            
            return;
        }
        
        if(root.val>=min){
            ans[0]++;
            min=root.val;
        }
        
        dfs(root.left,min,ans);
        dfs(root.right,min,ans);
        
    }
}