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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Double> ans=new ArrayList<>();
        
        q.add(root);
         
        while(!q.isEmpty()){
            int size=q.size();
            int N=size;
            double avg=0.0000;
            while(size-->0){
                
                TreeNode temp=q.poll();
                
                avg+=temp.val;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                
                if(temp.right!=null){
                    q.add(temp.right);
                }
                
            }
            
            ans.add(avg/N);
            
        }
        
        return ans;
        
    }
}