
//User function Template for Java

/* class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
}*/

//This function should return head to the DLL

class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here	
	if(root==null) return null;
	  ArrayList<Integer> inorder=new ArrayList<>();
	  MorrisTraversal(root,inorder);
	  
	  Node head=new Node(inorder.get(0));
	  Node curr=head;
	  head.right=null;
	  head.left=null;
	  
	  for(int i=1;i<inorder.size();i++){
	      Node node=new Node(inorder.get(i));
	      head.right=node;
	      node.left=head;
	      head=node;
	  }
	  
	  return curr;
    }
    
    void MorrisTraversal(Node root,ArrayList<Integer> inorder){
        if(root==null ) return;
        
        Node curr=root;
        
        while(curr!=null){
            if(curr.left==null){
                inorder.add(curr.data);
                curr=curr.right;
            }else{
                Node temp=curr.left;
                
                while(temp.right!=null && temp.right!=curr){
                    temp=temp.right;
                }
                
                if(temp.right==null){
                    temp.right=curr;
                    curr=curr.left;
                }else{
                    temp.right=null;
                    inorder.add(curr.data);
                    curr=curr.right;
                }
            }
        }
    }
}
