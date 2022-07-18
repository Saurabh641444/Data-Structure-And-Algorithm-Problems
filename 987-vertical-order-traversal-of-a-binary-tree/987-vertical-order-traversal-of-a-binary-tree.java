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
    int y;
    
    Pair(TreeNode node,int x,int y){
        this.node=node;
        this.x=x;
        this.y=y;
    }
    
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        // if(root==null) return ans;
        
        Queue<Pair> q=new LinkedList<Pair>();
        
        q.add(new Pair(root,0,0));
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                Pair temp=q.poll();
                TreeNode node=temp.node;
                int x=temp.x;
                int y=temp.y;
                
                if(!map.containsKey(x)){
                    map.put(x,new TreeMap<>());
                }
                
                if(!map.get(x).containsKey(y)){
                    map.get(x).put(y,new PriorityQueue<>());
                }
                
                map.get(x).get(y).add(node.val);
                
                if(node.left!=null){
                    q.add(new Pair(node.left,x-1,y+1));
                }
                
                if(node.right!=null){
                    q.add(new Pair(node.right,x+1,y+1));
                }
                
            }
        }
        
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:ys.values()){
                
                while(!nodes.isEmpty()){
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        
        return ans;
    }
}