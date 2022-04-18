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
/*class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        return list.get(k-1);
    }
    
    private void dfs(TreeNode root, List<Integer> list){
        if(root==null) return;
        
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);
    }
}*/

class Solution {
    int count=0;
    int out=0;
    public int kthSmallest(TreeNode root, int k) {
       
        dfs(root,k);
        return out;
    }
    
    private void dfs(TreeNode root, int k){
   
        
        if(root.left!=null) dfs(root.left,k);
        
       count++;
        
        if(count==k){ out=root.val; return;}
        if(root.right!=null) dfs(root.right,k);
    }
}