class Solution{
public Node deleteNode(Node root,int k){
if(root==null){ return null;}
if(root.data>k){
return deleteNode(root.left,k);
}else{
root.right=deleteNode(root.right,k);
return root;
}
}

}
