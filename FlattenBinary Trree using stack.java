class Solution
{
    static Node prev=null;
    public static void flatten(Node root)
    {
        //code here
        if(root==null) return;
       
       Stack<Node> st=new Stack<>();
       st.push(root);
       
       while(st.size()>0){
           
           Node curr=st.pop();
           
           if(curr.right!=null){
               st.push(curr.right);
           }
           
           
           if(curr.left!=null){
               st.push(curr.left);
           }
           
           if(st.size()>0){
               curr.right=st.peek();
           }
           curr.left=null;
       }
    }
    
    private static void solve(Node root,Node prev){
        
        
        
    }
}
