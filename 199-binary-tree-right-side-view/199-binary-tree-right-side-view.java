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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(q.size()>0){
            int size=q.size();
            
            while(size>0){
                TreeNode p=q.poll();
                
                if(size==1){
                    ans.add(p.val);
                }
                
                if(p.left!=null){
                    q.add(p.left);
                }
                
                if(p.right!=null){
                    q.add(p.right);
                }
                
                size--;
            }
        }
        
        return ans;
    }
}