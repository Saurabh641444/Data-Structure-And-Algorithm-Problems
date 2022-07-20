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
    public boolean checkTree(TreeNode root) {
        if(root==null ) return true; 
        int child=0; 
        
        if(root.left!=null){
            child+=root.left.val;
        }
        
         if(root.right!=null){
            child+=root.right.val;
        }
        
        if(root.val!=child){
            return false;
        }
        checkTree(root.left); 
            checkTree(root.right);
         return true;
    }
}