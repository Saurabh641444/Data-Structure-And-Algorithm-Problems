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
    int max;
    public int maxPathSum(TreeNode root) {
         max=Integer.MIN_VALUE;
        
        dfs(root);
        
        return max;
    }
    
    private int dfs(TreeNode root){
        if(root==null) return 0;
         max=Math.max(max,root.val);
        // System.out.println(max);
        int left=Math.max(0,dfs(root.left));
         
       
        int right=Math.max(0,dfs(root.right));
        int currSum=left+root.val+right;
       
       
     
      
        max=Math.max(max,currSum);

        
        return root.val+Math.max(left,right);
    }
}