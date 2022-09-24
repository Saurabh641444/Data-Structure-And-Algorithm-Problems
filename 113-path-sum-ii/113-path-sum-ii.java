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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        dfs(root,targetSum,0,ans,res);
        
        return ans;
        
    }
    
    private boolean isLeaf(TreeNode node){
        if(node.right==null && node.left==null) return true;
        return false;
    }
    
    private void dfs(TreeNode root, int targetSum,int currSum,List<List<Integer>> ans, List<Integer> res){
        
        if( root==null) return;
        
        
         currSum+=root.val;
        res.add(root.val);
        
        
        if(currSum==targetSum && isLeaf(root)){
            ans.add(new ArrayList<>(res));     
        }else{
        dfs(root.left,targetSum,currSum,ans,res);
        dfs(root.right,targetSum,currSum,ans,res);
        }
       
        currSum-=root.val;
        res.remove(res.size()-1);
         
        
        
    }
    
    
}