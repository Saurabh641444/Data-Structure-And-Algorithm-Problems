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
class Pair{
    TreeNode node;
    int x;
    Pair(TreeNode node,int x){
        this.node=node;
        this.x=x;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null) return 0;
        
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int max=0;
        
        while(q.size()>0){
            int size=q.size();
            int min=q.peek().x;
            int first=0,last=0;
            
            for(int i=0;i<size;i++){
                Pair temp=q.poll();
                TreeNode node=temp.node;
                int x=temp.x;
                int curr_id=x-min;
                if(i==0) first=curr_id;
                if(i==size-1) last=curr_id;
                
                if(node.left!=null){
                    q.add(new Pair(node.left,curr_id*2+1));
                }
                
                if(node.right!=null){
                    q.add(new Pair(node.right,curr_id*2+2));
                }
            }
            
            max=Math.max(last-first+1,max);
        }
        
        return max;
        
    }
}