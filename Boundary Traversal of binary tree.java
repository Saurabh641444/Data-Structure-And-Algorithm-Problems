
//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }
class Solution
{
    	boolean isLeaf(Node node){
	    return (node.left==null) && (node.right==null);
	}
	
	void leftBoundry(Node node,ArrayList<Integer> res){
	    Node curr=node.left;
	    while(curr!=null){
	    if(isLeaf(curr)==false) res.add(curr.data);
	   
	    
	    if(curr.left!=null)  curr=curr.left;
	    else curr=curr.right;
	        
	    }
	}
	

	

	
	void rightBoundry(Node node,ArrayList<Integer> res){
	    Node curr=node.right;
	    ArrayList<Integer> temp=new ArrayList<>();
	    while(curr!=null){
	    if(isLeaf(curr)==false)  temp.add(curr.data);
	    
	    
	    if(curr.right!=null)  curr=curr.right;
	    else curr=curr.left;
	        
	    }
	    int i;
	    for(i=temp.size()-1;i>=0;i--){
	        res.add(temp.get(i));
	    }
	   // res.addAll(temp);
	}

	void leaves(Node node,ArrayList<Integer> res){
   
         if(isLeaf(node)){
	      res.add(node.data);
	      return;
	    }

	     if(node.left!=null) leaves(node.left,res);
	     if(node.right!=null) leaves(node.right,res);
	   
	}

	ArrayList <Integer> boundary(Node root)
	{
	    ArrayList<Integer> res=new ArrayList<>();
	    
	   // if(node==null) return res;
	    
	    if(isLeaf(root)==false) {
	        res.add(root.data);
	       
	    }
	    leftBoundry(root,res);
	    leaves(root,res);
	    rightBoundry(root,res);
	    
	    return res;
	}
	
}
