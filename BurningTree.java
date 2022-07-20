
class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        Map<Node,Node> parent_track=new HashMap<>();
        
        Map<Node,Boolean> visited=new HashMap<>();
        Queue<Node> q=new LinkedList<>();
        // q.add(new Node(target));
        // visited.put(new Node(target),true);
        findParent(root,parent_track,q,visited,target);
        int level=-1;
        while(!q.isEmpty()){
            int size=q.size();
            level++;
            for(int i=0;i<size;i++){
                Node temp=q.poll();
                
                if(temp.left!=null && visited.get(temp.left)==null){
                    q.add(temp.left);
                    visited.put(temp.left,true);
                }
                
                if(temp.right!=null && visited.get(temp.right)==null){
                    q.add(temp.right);
                    visited.put(temp.right,true);
                }
                
                if(parent_track.get(temp)!=null && visited.get(parent_track.get(temp))==null){
                    q.add(parent_track.get(temp));
                    visited.put(parent_track.get(temp),true);
                }
                
            }
            
          
        }
        
          return level;
    }
    
    private static void findParent(Node node,Map<Node,Node> parent_track,Queue<Node> q,  Map<Node,Boolean> visited,int target){
        
        Queue<Node> q1=new LinkedList<>();
        q1.add(node);
        
        while(!q1.isEmpty()){
           Node temp=q1.poll();
           
           if(temp.data==target){
               q.add(temp);
               visited.put(temp,true);
           }
           if(temp.left!=null){
               parent_track.put(temp.left,temp);
               q1.add(temp.left);
           }
           
           if(temp.right!=null){
               parent_track.put(temp.right,temp);
               q1.add(temp.right);
           }
           
        }
        
    }
}
