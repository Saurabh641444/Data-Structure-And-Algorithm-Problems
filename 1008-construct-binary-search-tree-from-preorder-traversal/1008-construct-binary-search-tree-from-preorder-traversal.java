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
/*
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        
        int inorder[]=new int[preorder.length];
       
        for(int i=0;i<preorder.length;i++){
            inorder[i]=preorder[i];
            
        }
       
        
        Arrays.sort(inorder );
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        
        return helper(preorder, inorder, 0, preorder.length-1,0,inorder.length-1,hm);
    }
    
    private TreeNode helper(int preorder[],int [] in, int sp,int ep,int si, int ei,HashMap<Integer,Integer> hm){
       
        if(sp>ep || ei<si || sp>=preorder.length){return null;}
        TreeNode root=new TreeNode(preorder[sp]);
        int rootIndex=hm.get(root.val);
        int numleft=rootIndex-si;
        
        root.left=helper(preorder,in,sp+1,sp+numleft,si,rootIndex-1,hm);
        root.right=   helper(preorder,in,sp+numleft+1,ep,rootIndex+1,ei,hm);     
        return root;
    }
}*/

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        
       return helper(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    
    private TreeNode helper(int[] preorder,int max,int [] i){
        
        if(i[0]==preorder.length || max<preorder[i[0]]){
            return null;
        }
        
        TreeNode root=new TreeNode(preorder[i[0]++]);
        root.left=helper(preorder,root.val,i);
        root.right=helper(preorder,max,i);
        return root;
    }
    
  
}