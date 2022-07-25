
//User function Template for Java

/*
node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Tree
{
    //Function to check whether a binary tree is foldable or not.
    boolean IsFoldable(Node node) 
	{ 
		// your code 
		
		if(node==null) return true;
		
		return dfs(node.left,node.right);
	} 
	
	boolean dfs(Node l,Node r){
	    
	    if(l==null || r==null){
	        return l==r;
	    }
	    
	    return dfs(l.left,r.right) && dfs(l.right,r.left);
	}
}
