class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
  
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Node p;
        
        while(q.size()>0){
            int size=q.size();
            
            while(size>0){
               p =q.poll();
                
                if(size==1){
                    ans.add(p.data);
                }
                
                 if(p.right!=null){
                    q.add(p.right);
                }
                
                
                if(p.left!=null){
                    q.add(p.left);
                }
                
               
                size--;
            }
        }
        
        return ans;
    
    }
}
