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
    public TreeNode pruneTree(TreeNode root) {
        
        
         return dfs(root)? root:null;
       
    }
    
    private boolean dfs(TreeNode root){
        
        if(root==null){
            return false;
        }
        
        
       boolean l= dfs(root.left);
         
       boolean r=dfs(root.right);
        
        if(!l) root.left=null;
        if(!r) root.right=null;
        
        return root.val ==1|| l|| r;
         
        
    }
    
}