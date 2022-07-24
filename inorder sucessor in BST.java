/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */


public class Solution {
    /*
     * @param root: The root of the BST.
     * @param p: You need find the successor node of p.
     * @return: Successor of p.
     */
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // write your code here
        if(root==null) return null;
        TreeNode curr=root;
        ArrayList<Integer> arr=new ArrayList<>();
        dfs(root,arr);
          
          int data=null;

          for(int i=0;i<arr.size();i++){
              if(arr.get(i)==p.val && i+1<arr.size()){
                data=arr.get(i+1);
              }
          }
           if(data==null) return null;
           return new TreeNode(data);
    }

    private void dfs(TreeNode root, ArrayList<Integer> arr){
    
      if(root==null ) return;

      TreeNode curr=root;

      while(curr!=null){
          if(curr.left==null){
              arr.add(curr.val);
              curr=curr.right;
          }else{
              TreeNode temp=curr.left;

              while(temp.right!=null && temp.right!=curr){
                  temp=temp.right;
              }

              if(temp.right==null){
              temp.right=curr;
              curr=curr.left;
              }else{
                  temp.right=null;
                  inorder.add(curr.val);
                  curr=curr.right;
              }
          }

      }

    }
}
