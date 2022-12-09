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
    int res;
    public int maxAncestorDiff(TreeNode root) {
        if(root==null) return 0;
        
        res=0;
        dfs(root,root.val,root.val);
        return res;
    }
    
    private void dfs(TreeNode root, int currMax,int currMin){
        if(root==null){
            return ;
        }
        
        res=Math.max(res,Math.max(Math.abs(currMax-root.val),Math.abs(currMin-root.val)));
        currMax=Math.max(currMax,root.val);
        currMin=Math.min(currMin,root.val);
        dfs(root.left,currMax,currMin);
        dfs(root.right,currMax,currMin);
        
    }
}