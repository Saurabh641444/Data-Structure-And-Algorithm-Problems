class Pair{
    Node node;
    int x;
    
    public Pair(int x,Node node){
        this.node=node;
        this.x=x;
    }
}

class Solution
{
    
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        
        if(root==null) return ans;
        
        q.add(new Pair(0,root));
        
        Map<Integer,Node> map=new TreeMap<>();
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                Pair temp=q.poll();
                
                Node node=temp.node;
                int x=temp.x;
                
                if(!map.containsKey(x)){
                    map.put(x,node);
                }
                
                if(node.left!=null){
                    q.add(new Pair(x-1,node.left));
                }
                
                 if(node.right!=null){
                    q.add(new Pair(x+1,node.right));
                }
            }
        }
        
        for(Map.Entry<Integer,Node> temp:map.entrySet()){
            ans.add(temp.getValue().data);
        }
        
        return ans;
        
    }
}
