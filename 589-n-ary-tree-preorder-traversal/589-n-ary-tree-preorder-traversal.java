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
    public List<Integer> preorder(Node root) {
        LinkedList<Integer> list=new LinkedList<>();
        preorder(list,root);
        return list;
    }
    
     public List<Integer> preorder( List<Integer> list,Node root) {
        if(root==null){
            return list;
        }
         list.add(root.val);
         for(Node n:root.children){
             list=preorder(list,n);
         }
         
         return list;
    }
}