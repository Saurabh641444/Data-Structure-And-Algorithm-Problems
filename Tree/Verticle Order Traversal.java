class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
      TreeNode node;
      int x=0;
      int level=0;

     VerticalNode(TreeNode node,int x, int level){
           this.node=node;
           this.x=x;
           this.level=level;
           
       }
  
     public int compareTo(verticalNode obj){
       
        if(this.level==obj.level)
        return this.node.val - obj.node.val;
      
        return this.level- obj.level;
     }
    }
   
    public List<List<Integer>> verticalTraversal(TreeNode root){
 
    List<List<Integer>> result =new LinkedList<>();
    
    PriorityQueue<VerticalNode> queue=new PriorityQueue<>();
    Map<Integer,List<Integer>> map=new TreeMap<>();

    queue.add(new VerticalNode(root,0,0));

     int level=0;
     
     while(!queue.isEmpty()){
        
         int size=queue.size();
         
       while(size-->0){
          VerticalNode vertNode=queue.poll();
          if(!map.containsKey(vertNode.x)){
                map.put(vertNode.x,new LinkedList<>());
           }
           map.get(vertNode.x)
        }
     }

   }



}
