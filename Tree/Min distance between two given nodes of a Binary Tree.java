class GfG {
   //finding the common node or ancestor
   Node lca(Node root, int n1,int n2)
{   
   Node left,right;
 // Your code here
       if(root == null)
           return null;
       if(root.data == n1 || root.data == n2)
           return root;
       left = lca(root.left,n1,n2);
       right = lca(root.right,n1,n2);
       if(left != null && right != null)
           return root;
       else
           return left != null ? left : right;
}

   int findDist(Node root, int n1, int n2) {
       // Your code here
        int  left,right;
 // Your code here
 Node lca=lca(root,n1,n2);
       left = find(lca,n1);
       //calling them from lca rather than root
       right = find(lca,n2);
   
           return left+right-2;
   }
   //
   int find (Node root, int n1){
        int  left,right;
 // Your code here
       if(root == null)
           return 0;
       if(root.data == n1)
           return 1;
       left = find(root.left,n1);
       right = find(root.right,n1);
       if(left == 0 && right == 0)
           return 0;
       else
           return left+right+1;
   }
}
