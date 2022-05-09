class LRUCache {
    
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        int data;
        
        Node(int k,int v){
            key=k;
            val=v;
        }
    }
    
    private HashMap<Integer,Node> hm=new HashMap<>();
    private int capacity;
    private Node head;
    private Node last;
    
    public LRUCache(final int capacity) {
        this.capacity=capacity;
        head=new Node(0,0);
        last=new Node(0,0);
        head.next=last;
        last.prev=head;
        
    }
    
    public int get(int key) {
        Node node=hm.get(key);
        
        if(node==null){
            return -1;
        }
        
        remove(node);
        insert(node);
        return node.val;
        
    }
    
    public void put(int key, int val) {
        if(hm.containsKey(key)){
           remove(hm.get(key)); 
        }
        
           if(hm.size()==capacity){
           remove(last.prev); 
        }
        
        insert(new Node(key,val));
    }
    
    private void remove(Node node){
        hm.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    
    private void insert(Node node){
        hm.put(node.key,node);
        node.next=head.next;
        head.next.prev=node;
        node.prev=head;
        head.next=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */