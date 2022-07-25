
/*class Tree{
int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/


class GfG 
{
    //Function to make binary tree from linked list.
   /* public static Tree convert(Node head, Tree node) {
        // add code here.}
        ArrayList<Integer> list=new ArrayList<>();
        
        Node curr=head;
        
        while(curr!=null){
            list.add(curr.data);
            curr=curr.next;
        }
        
        Queue<Tree> q=new LinkedList<>();
        Tree root=new Tree(list.get(0));
        q.add(root);
        int i=1;
        while(i<list.size()&& q.size()>0){
            Tree temp=q.poll();
            
            temp.left=new Tree(list.get(i));
            q.add(temp.left);
            i++;
            
            if(i>=list.size()) break;
            
            temp.right=new Tree(list.get(i));i++;
             q.add(temp.right);
        }
        
        return root;
    }*/
    
      //Function to make binary tree from linked list.
    public static Tree convert(Node head, Tree node) {
        // add code here.}
       
        
        Node curr=head;
        
       
        
        Queue<Tree> q=new LinkedList<>();
        Tree root=new Tree(curr.data);
        curr=curr.next;
        q.add(root);
        
        while(curr!=null&& q.size()>0){
            Tree temp=q.poll();
            
            temp.left=new Tree(curr.data);
            curr=curr.next;
            q.add(temp.left);
            
            
            if(curr==null) break;
            
            temp.right=new Tree(curr.data);
             curr=curr.next;
             q.add(temp.right);
        }
        
        return root;
    }
}  
