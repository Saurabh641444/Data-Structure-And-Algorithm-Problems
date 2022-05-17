/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
     TreeNode ans=null;
      boolean flag=false;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        dfs(original,cloned,target);
        return ans;
    }
     
   public void dfs(TreeNode original,TreeNode cloned, TreeNode target){
       if(flag==true) return;
       
       if(original!=null){
           dfs(original.left,cloned.left,target);
            if(original==target){
                  ans=cloned;
                  flag=true;
                  return;
                 } 
             dfs(original.right,cloned.right,target);  
           }

    }

}