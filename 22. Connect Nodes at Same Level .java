//User function Template for Java

 /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    
class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        // Your code goes here.
        if(root==null) return;
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
                    last.nextRight=null;
                }
                if(first==null && last!=null){
                    first=last;
                }else if(first!=null && last!=null){
                    first.nextRight=last;
                    first=last;
                }
            }
        }
    }
}
