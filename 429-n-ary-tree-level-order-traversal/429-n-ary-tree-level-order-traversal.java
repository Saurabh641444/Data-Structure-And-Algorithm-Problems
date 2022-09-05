/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        Queue<Node> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        q.add(root);
        
        while(q.size()>0){
            int size=q.size();
            List<Integer> res=new ArrayList<>();
            
            while(size-->0){
                Node temp=q.poll();
                
                res.add(temp.val);
                
                for(Node ele:temp.children){
                    
                    q.add(ele);
                }
                
                
            }
            
            ans.add(res);
            
            
        }
        
        
        return ans;
        
    }
}