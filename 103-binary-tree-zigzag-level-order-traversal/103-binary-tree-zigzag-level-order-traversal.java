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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res=new ArrayList<List<Integer>>();
          if(root==null) return res;
          Stack<TreeNode> s1=new Stack<>();
          Stack<TreeNode> s2=new Stack<>();
          s1.push(root);
        
        while(!s1.isEmpty()||!s2.isEmpty()){
            List<Integer> tmp=new ArrayList<>();
            while(!s1.isEmpty()){
                TreeNode c=s1.pop();
                tmp.add(c.val);
                if(c.left!=null){ s2.push(c.left);}
                if(c.right!=null){ s2.push(c.right);}
            }
            res.add(tmp);
            tmp=new ArrayList<>();
            while(!s2.isEmpty()){
                TreeNode c=s2.pop();
                tmp.add(c.val);
                
                if(c.right!=null){ s1.push(c.right);}
                if(c.left!=null){ s1.push(c.left);}
            }
            
            if(!tmp.isEmpty()) res.add(tmp);
        }
        
        return res;
    }
    
   
}*/

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res=new ArrayList<List<Integer>>();
          if(root==null) return res;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            
            int size=q.size();
            LinkedList<Integer> ans=new LinkedList<>();
            
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                if(flag){
                    ans.addFirst(temp.val);
                }else{
                    ans.add(temp.val);
                }
            }
            flag=!flag;
            res.add(ans);
            
        }
        
        return res;
    }
    
   
}