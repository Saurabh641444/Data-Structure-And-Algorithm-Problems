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
     // Creating three global pointers
    private TreeNode prev ;
    private TreeNode first ;
    private TreeNode last ;
    private TreeNode middle;
    
    public void recoverTree(TreeNode root) {
       first=last=middle=null;
        TreeNode prev =new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        
        if(first!=null && last!=null){
            int t=first.val;
            first.val=last.val;
            last.val=t;
        }else if(first!=null && middle!=null){
            int t=first.val;
            first.val=middle.val;
            middle.val=t;
        }
    }
    
    private void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);
        
        if(prev!=null && root.val<prev.val){
            
            if(first==null){
                first=prev;
                middle=root;
            }else{
                last=root;
            }
        }
        
        prev=root;
        inorder(root.right);
    }
   
}