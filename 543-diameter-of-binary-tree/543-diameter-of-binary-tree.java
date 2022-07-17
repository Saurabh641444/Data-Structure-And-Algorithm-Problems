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
/*
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
       if(root==null) return 0;
        
        int max=0;
        
            int lhs=    diameterOfBinaryTree(root.left);
       int rhs= diameterOfBinaryTree(root.right);
        int lh=height(root.left);
        int rh=height(root.right);
        
        max=Math.max(lh+rh+2,Math.max(lhs,rhs));
        

        return max;
    }
    
    private int height(TreeNode root){
        if(root==null) return -1;
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
}*/

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
       if(root==null) return 0;
        
      int maximum[]=new int[1];
        
      height(root,maximum);
        

        return maximum[0];
    }
    
    private int height(TreeNode root,int[] maximum){
        if(root==null) return 0;
        int l=height(root.left,maximum);
        int r=height(root.right,maximum);
        maximum[0]=Math.max(maximum[0],l+r);
        return Math.max(l,r)+1;
    }
}