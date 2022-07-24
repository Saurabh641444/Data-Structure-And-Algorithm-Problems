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

class BSTIterator {
	Stack<TreeNode> stack;
    boolean reverse=true;
	public BSTIterator(TreeNode root,boolean isReverse) {
		stack = new Stack<>();
        reverse=isReverse;
		TreeNode node = root;
		addAll(node);                                     
	}

	public int next() {
		TreeNode toRemove = stack.pop();
		if(reverse==false) addAll(toRemove.right);
        else   addAll(toRemove.left);               
		return toRemove.val;
	}
	public boolean hasNext() {
		return !stack.isEmpty();    
	}
                
               

	public void addAll(TreeNode node){
		while(node != null){
			stack.add(node);
            if(reverse==true){
			node = node.right;
                 }
            else{
            node=node.left;
             }
		}
	}

                 
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        BSTIterator l=new BSTIterator(root,false);
        BSTIterator r=new BSTIterator(root,true);

        int i=l.next();
        int j=r.next();

       while(i<j){
                if(i+j==k) return true;
                else if(i+j<k) i=l.next();
                else j=r.next();
             }
      return false;
    }
}