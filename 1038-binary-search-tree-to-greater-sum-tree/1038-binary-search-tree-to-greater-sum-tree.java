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
    public TreeNode bstToGst(TreeNode root) {
        
        reverseOrder(root,0);
        return root;
    }
    
    public int reverseOrder(TreeNode root, int sum){
        if(root==null){ return sum;}
        
        root.val+=reverseOrder(root.right,sum);
        return reverseOrder(root.left,root.val);
        
    }
}