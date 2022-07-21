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
    int index=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){
          hm.put(inorder[i],i);    
        }
        
        TreeNode root=buildTreeHelper(inorder,postorder,0,inorder.length-1,0,postorder.length-1,hm);
        
        return root;
    }
    
    private TreeNode buildTreeHelper(int[] inorder,int[] postorder,int in_start,int in_end,int post_start,int post_end, HashMap<Integer,Integer> hm){
        
        if(post_end<post_start || in_start>in_end || post_end<0 ) return null;
        
        TreeNode root=new TreeNode(postorder[post_end]);
        int rootIndex=hm.get(postorder[post_end]);
        int numleft=rootIndex-in_start;
        
        root.left=buildTreeHelper(inorder,postorder,in_start,rootIndex-1,post_start,post_start+numleft-1,hm);
        root.right=buildTreeHelper(inorder,postorder,rootIndex+1,in_end,post_start+numleft,post_end-1,hm);
        
        return root;
        
    }
}