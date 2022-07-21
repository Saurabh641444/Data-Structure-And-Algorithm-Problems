class Solution
{
     static int index=0;
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<n;i++){
            hm.put(inorder[i],i);
        }
        
        Node root=buildTreeHelper(inorder,preorder,0,n-1,0,n-1,hm);
        
        return root;
    }
    
    private static Node buildTreeHelper(int[] inorder,int[] preorder,int in_start,int in_end,int pre_start,int pre_end, HashMap<Integer,Integer> hm){
      
      if(in_end<in_start || pre_start>pre_end || pre_start>=inorder.length) return null;
     
      Node root=new Node(preorder[pre_start]);
      int rootIndex=hm.get(root.data);
      
      root.left=buildTreeHelper(inorder,preorder,pre_start+1,pre_start+rootIndex-in_start,in_start,rootIndex-1,hm);
      root.right=buildTreeHelper(inorder,preorder,pre_start+rootIndex-in_start,pre_end,rootIndex+1,in_end,hm);
      
      return root;
        
    }
}
