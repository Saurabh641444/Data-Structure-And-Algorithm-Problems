int index=0;
public TreeNode buildTree(int[] inorder,int[] preorder){
    HashMap<Integer,Integer> hm=new HashMap<>();

    for(int i=0;i<inorder.length;i++){
             hm.put(inorder[i],i);
      }

  TreeNode root=buildTreeHelper(inorder,preorder,0,inorder.length-1,hm);

  return root;

}

private TreeNode buildTreeHelper(int [] inorder,int[] preorder, int start,int end,HashMap<Integer,Integer> hm){
       if(end<start) return null;
       TreeNode root=new Node(preorder[index++]);
        int rootIndex=hm.get(root.val);
      
     root.left=buildTreeHelper(inorder,preorder,start,rootIndex-1,hm);
     root.right=buildTreeHelper(inorder,preorder,rootIndex+1,end,hm);
  return root;
  
}
