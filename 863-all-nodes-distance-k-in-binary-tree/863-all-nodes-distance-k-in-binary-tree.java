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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent_track=new HashMap<>();
        findParent(root,parent_track);
        Map<TreeNode,Boolean> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);
        visited.put(target,true);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(level==k) break;
            level++;
            for(int i=0;i<size;i++){
             TreeNode temp=q.poll();
             
                if(temp.left!=null && visited.get(temp.left)==null){
                    q.add(temp.left);
                    visited.put(temp.left,true);
                }
                
                if(temp.right!=null && visited.get(temp.right)==null){
                    q.add(temp.right);
                    visited.put(temp.right,true);
                }
                
                if(parent_track.get(temp)!=null &&    visited.get(parent_track.get(temp))==null){
                    q.add(parent_track.get(temp));
                    visited.put(parent_track.get(temp),true);
                }
            }
            
           
            
        }
        
         List<Integer> ans=new ArrayList<>();
            
            while(!q.isEmpty()){
                ans.add(q.poll().val);
            }
        return ans;
    }
    
    private void findParent(TreeNode root,Map<TreeNode,TreeNode> parent_track){
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            
            if(temp.left!=null){
                parent_track.put(temp.left,temp);
                q.add(temp.left);
            }
            
            if(temp.right!=null){
                parent_track.put(temp.right,temp);
                q.add(temp.right);
            }
            
        }
    }
}