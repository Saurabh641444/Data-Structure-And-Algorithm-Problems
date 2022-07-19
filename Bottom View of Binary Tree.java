class Pair{
Node node;
int x;

 Pair(Node node,int x){
    this.node=node;
    this.x=x;
    }   

}

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
         Map<Integer,Node> map=new TreeMap<>();
         Queue<Pair> q=new LinkedList<>();
         q.add(new Pair(root,0));
         while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair temp=q.poll();
                Node node=temp.node;
                int x=temp.x;
                
                if(!map.containsKey(x)){
                    map.put(x,node);
                }else{
                    map.remove(x);
                     map.put(x,node);
                }
                
                if(node.left!=null){
                    q.add(new Pair(node.left,x-1));
                }
                
                if(node.right!=null){
                    q.add(new Pair(node.right,x+1));
                }
            }
         }
         
         for(Map.Entry<Integer,Node> em:map.entrySet()){
             ans.add(em.getValue().data);
         }
         
         return ans;
    }
}
