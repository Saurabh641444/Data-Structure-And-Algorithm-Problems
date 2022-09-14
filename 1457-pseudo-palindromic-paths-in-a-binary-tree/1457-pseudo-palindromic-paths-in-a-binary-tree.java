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
    int digits[];
    int result=0;

    public int pseudoPalindromicPaths (TreeNode root) {
        digits=new int[10];
        dfs(root);
        return result;
    }
    
    private void dfs(TreeNode root){
       
        if(root==null) return;
        
        digits[root.val]++;
        
        if(root.left==null && root.right==null ){
            if(isPalindrome()) result++;
        }else{
            dfs(root.left);
            dfs(root.right);
        }
        
        digits[root.val]--;
      
    }
    
    private boolean isPalindrome(){
        
        int odd=0;
        
        for(int i=1;i<=9;i++){
            if(digits[i]%2==1) odd++;
        }
        
       if(odd>1){
           return false;
       }
        
        return true;
    }
    
}