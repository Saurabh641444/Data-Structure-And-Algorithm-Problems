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
    /*int count=0;
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        
        count++;
        countNodes(root.left);
        countNodes(root.right);
        
        return count;
    }*/
    
     public int countNodes(TreeNode root) {
        if(root==null) return 0;
        
         int l=getleftHeight(root);
         int r=getrightHeight(root);
         
         if(l==r){
             return ((2<<l)-1);
         }else{
             return 1+ countNodes(root.left)+countNodes(root.right);
         }
    }
    
    private int getleftHeight(TreeNode node){
      int count=0;
        
        while(node.left!=null){
          count++;
            node=node.left;
        }
        
        return count;
    }
    
    private int getrightHeight(TreeNode node){
      int count=0;
        
        while(node.right!=null){
          count++;
            node=node.right;
        }
        
        return count;
    }
    
    
    
}