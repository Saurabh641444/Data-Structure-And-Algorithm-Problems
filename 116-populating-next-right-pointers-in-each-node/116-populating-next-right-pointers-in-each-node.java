/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
/*
class Solution {
    public Node connect(Node root) {
         if(root==null) return null;
        Queue<Node> q=new LinkedList<>();
        
        q.add(root);
    
        while(!q.isEmpty()){
            int size=q.size();
            Node first=null;
            Node last=null;
            
            while(size-->0){
                Node temp=q.poll();
                last=temp;
                
                if(temp.left!=null) q.add(temp.left);
                if (temp.right!=null) q.add(temp.right);
                if(size==0){
                    last.next=null;
                }
                if(first==null && last!=null){
                    first=last;
                }else if(first!=null && last!=null){
                    first.next=last;
                    first=last;
                }
            }
        }
        
        return root;
    }
}*/

// Recursive Approach

class Solution {
    public Node connect(Node root) {
         if(root==null) return null;
         
        dfs(root.left,root.right);
        return root;
    }

     private void dfs(Node l,Node r){
          if(l==null || r==null) return;
         l.next=r;
          dfs(l.left,l.right);
          dfs(r.left,r.right);
           dfs(l.right,r.left);
      }
}