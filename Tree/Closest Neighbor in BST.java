class Tree
{
    public static int findMaxForN(Node node, int val)
    {
    //Add your code here.
    if(node==null){
        return -1;
    }
    
    if(node.key==val){
        return node.key;
        
    }
    else if(val>node.key){
        int check=findMaxForN(node.right,val);
        if(check!=-1){
            
          return check;
        }else{
            return node.key;
        }
        
    }else if(val<node.key){
        int check=findMaxForN(node.left,val);
        return check;
    }
    return -1;
    }
}
