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
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        
        int sum[]=new int[1];
        sum[0]=Integer.MIN_VALUE;
        dfs(root,sum);
        
        return sum[0];
    }
    
    private int dfs(TreeNode node,int[] sum){
        
        if(node==null) return 0;
        
        int l=Math.max(0,dfs(node.left,sum));
        int r=Math.max(0,dfs(node.right,sum));
        
        sum[0]=Math.max(l+r+node.val,sum[0]);
        
        return node.val+Math.max(l,r);
    }
}