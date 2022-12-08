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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // if(root1.val!=root2.val) return false;
        
        ArrayList<Integer> tree1=new ArrayList<>();
        dfs(root1,tree1);
        
        ArrayList<Integer> tree2=new ArrayList<>();
        dfs(root2,tree2);
        
        return tree1.equals(tree2);
        
//         if(tree1.size()!=tree2.size()) return false;
        
//         for(int i=0;i<tree1.size();i++){
//             if(tree1.get(i)!=tree2.get(i)) return false;
//         }
        
//         return true;
        
    }
    
    private void dfs(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        
        if(root.left==null && root.right==null) 
        {
            ans.add(root.val);
            return;
        }
        
       
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
}