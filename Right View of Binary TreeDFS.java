class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        ArrayList<Integer> ans=new ArrayList<>();
        
        dfs(node,0, ans);
        return ans;
    }
    
    void dfs(Node node,int level, ArrayList<Integer> ans){
        
        if(node==null) { return;}
        if(ans.size()==level) ans.add(node.data);
        dfs(node.right,level+1,ans);
        dfs(node.left,level+1,ans);
    }
}
