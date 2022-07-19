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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        if(root==null) return ans;
       
        Stack<TreeNode> st1=new Stack<>();
        Stack<String> st2=new Stack<>();
        
        st1.push(root);
        st2.push("");
        while(st1.size()>0){
            TreeNode currNode=st1.pop();
            String currStr=st2.pop();
            
            if(currNode.left==null && currNode.right==null){
                ans.add(currStr+currNode.val);
            }
            
            if(currNode.left!=null){
                st1.push(currNode.left);
                st2.push(currStr+currNode.val+"->");
            }
            
            if(currNode.right!=null){
                st1.push(currNode.right);
                st2.push(currStr+currNode.val+"->");
            }
        }
        
        
            return ans;
    }
    
    
}