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
    public boolean hasPathSum(TreeNode root, int targetSum) {
         if(root==null){
             return false;
         }
        
       
        
        targetSum=targetSum-root.val;
         if(root.left==null && root.right==null && targetSum==0){
            return true;
        }
         boolean l=   hasPathSum(root.left,targetSum);
        
        
        
          boolean r=  hasPathSum(root.right,targetSum);
        
        
        return l || r;
    }
}