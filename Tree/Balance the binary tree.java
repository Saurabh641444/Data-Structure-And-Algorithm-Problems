class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        inorder(root,list);
        return build(list,0,list.size());
    }
    private void inorder(TreeNode root,List<TreeNode> list){
     if(root==null) return;
    inorder(root.left,list);
    list.add(root);
    inorder(root.right,list);
}
   private TreeNode build(List<TreeNode> list, int start,int end){
      if(start==end) return null;
   int mid=(start+end)/2;
   TreeNode root=list.get(mid);
   root.left=build(list,start,mid);
   root.right=build(list,mid+1,end);
    return root;
  }
}
