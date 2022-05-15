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
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth=getMaxDepth(root);
        return getSum(root,1,maxDepth);
   }
    
     private int getSum(TreeNode node,int depth,int maxDepth){
         if(node==null) return 0;
         if(depth==maxDepth) return node.val;
        return getSum(node.left,depth+1,maxDepth)+getSum(node.right,depth+1,maxDepth); 
      }

     private  int getMaxDepth(TreeNode node){
           if(node==null) return 0;
           return Math.max(getMaxDepth(node.right),getMaxDepth(node.left))+1;
      }
}