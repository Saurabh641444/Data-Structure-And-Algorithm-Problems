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
class NodeValue {
    public int maxNode, minNode, maxSize,maxSum;
    public boolean isBST; 
    
    NodeValue(boolean isBST,int minNode, int maxNode,int maxSum) {
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.maxSum=maxSum;
        this.isBST=isBST;
    }
};
class Solution {
     int ans=0;
    public int maxSumBST(TreeNode root) {
        
          largestBSTSubtreeHelper(root);
        
        return ans < 0 ? 0 :ans;
    }
   
  private NodeValue largestBSTSubtreeHelper(TreeNode root) {
        // An empty tree is a BST of size 0.
        if (root == null) {
            return new NodeValue(true,Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }
        
        // Get values from left and right subtree of current tree.
        NodeValue left = largestBSTSubtreeHelper(root.left);
        NodeValue right = largestBSTSubtreeHelper(root.right);
        
        // Current node is greater than max in left AND smaller than min in right, it is a BST.
        if ( left.maxNode < root.val && root.val < right.minNode && left.isBST && right.isBST) {
            // It is a BST.
            // right.maxSum=root.left.val;
            // left.maxSum=root.right.val;
              ans=Math.max(left.maxSum+right.maxSum+ root.val,ans);
            return new NodeValue(true,Math.min(root.val,left.minNode), Math.max(root.val, right.maxNode),left.maxSum+right.maxSum+ root.val );
        }else{
        
        // Otherwise, return [-inf, inf] so that parent can't be valid BST
        return new NodeValue(false,Integer.MIN_VALUE, Integer.MAX_VALUE,0);
      }
    }
}