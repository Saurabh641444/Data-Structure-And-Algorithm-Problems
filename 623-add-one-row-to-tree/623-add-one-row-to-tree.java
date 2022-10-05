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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth==1){
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        
        insert(val,root,1,depth);
        
        return root;
        
    }
    
    public void insert(int val,TreeNode node,int depth,int n){
        
        if(node==null){
            return;
        }
        
        if(depth==n-1){
            TreeNode root=node.left;
            node.left=new TreeNode(val);
            node.left.left=root;
            root=node.right;
            node.right=new TreeNode(val);
            node.right.right=root;
            
        }else{
            insert(val,node.left,depth+1,n);
            insert(val,node.right,depth+1,n);

        }
    }
}