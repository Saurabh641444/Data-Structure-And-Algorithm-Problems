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
    public List<Integer> preorderTraversal(TreeNode root) {
          List<Integer> ans=new ArrayList<>();
        
        TreeNode cur=root;
        TreeNode prev;
        
        if(root==null) return ans;
        while(cur!=null){
            if(cur.left==null){
                ans.add(cur.val);
                cur=cur.right;
            }else{
                prev=cur.left;
                
                
                while(prev.right!=null && prev.right!=cur  ){
                    prev=prev.right;
                }
                
                if(prev.right==null){
                    prev.right=cur;
                     ans.add(cur.val); 
                    cur=cur.left;
                }else{
                    prev.right=null;
                  
                    cur=cur.right;
                }
            }
        }
        return ans;
    }
}