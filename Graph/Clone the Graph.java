class Solution {
    public Node cloneGraph(Node node) {
        if(node == null)
            return node;
        
        HashMap<Node, Node> hm= new HashMap<Node, Node>();
        Queue<Node> q=new LinkedList<>();
        hm.put(node,new Node(node.val));
        q.add(node);
         
        while(!q.isEmpty()){
        int size=q.size();
        for(int i=0;i<size;i++){
         Node temp=q.poll();
        List<Node> children=temp.neighbors;
       for(int k=0;k<children.size();k++){
       if(hm.containsKey(children.get(k))==false){
      q.add(children.get(k));
      hm.put(children.get(k),new Node(children.get(k).val));

       }
  hm.get(temp).neighbors.add(hm.get(children.get(k)));
        }
           
          }



        }
return hm.get(node);
    }
}
