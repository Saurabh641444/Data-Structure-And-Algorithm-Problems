class LFUCache {
     
     final int capacity;
     int curSize;
     int minFrequency;
     Map<Integer,Node> cache;
     Map<Integer,DoubleLinkedList> frequencyMap;

    public LFUCache(int capacity) {
        this.capacity=capacity;
        this.curSize=0;
        this.minFrequency=0;
        
        this.cache=new HashMap<>();
        this.frequencyMap=new HashMap<>();
    }
    
    public int get(int key) {
        Node curNode=cache.get(key);
        if(curNode==null){
             return -1;
          }
        update(curNode);
        return curNode.val;
    }
    
    public void put(int key, int value) {
        
       if(capacity==0){
               return;
           }

       if(cache.containsKey(key)){
            Node node=cache.get(key);
            node.val=value;
            update(node);
            }else{
                curSize++;
                
                if(curSize>capacity){
                   DoubleLinkedList minFreqList=frequencyMap.get(minFrequency);
                   cache.remove(minFreqList.tail.prev.key);
                   minFreqList.remove(minFreqList.tail.prev);
                    curSize--;
                     }
             minFrequency=1;
             Node newNode=new Node(key,value);
             DoubleLinkedList curList=frequencyMap.getOrDefault(1,new DoubleLinkedList());
             curList.insert(newNode);
           frequencyMap.put(1,curList);
             cache.put(key,newNode);
            }
    }

    public void update(Node curNode){
          int curFreq=curNode.frequency;
          DoubleLinkedList curList=frequencyMap.get(curFreq);
        
          curList.remove(curNode);
          
          if(curFreq==minFrequency && curList.listSize==0){
                minFrequency++;
                   }

          curNode.frequency++;
          DoubleLinkedList newList=frequencyMap.getOrDefault( curNode.frequency,new   DoubleLinkedList());
          newList.insert(curNode);
         frequencyMap.put(curNode.frequency,newList);
     }

   class Node{
     int key;
     int val;
     int frequency;
     Node prev;
     Node next;
      
     Node(int key,int val){
         this.key=key;
         this.val=val;
         this.frequency = 1;
        } 
    }
    
    class DoubleLinkedList{
         int listSize;
         Node head;
         Node tail;
         
        DoubleLinkedList(){
          this.listSize=0;
          this.head=new Node(0,0);
          this.tail=new Node(0,0);
           head.next=tail;
           tail.prev=head;
           }

        public void insert(Node node){
              Node nextNode=head.next;
              node.next=nextNode;
              node.prev=head;
              head.next=node;
              nextNode.prev=node;
              listSize++;
            }
     
        public void remove(Node node){
             Node prevNode=node.prev;
             Node nextNode=node.next;
             prevNode.next=nextNode;
             nextNode.prev=prevNode;
             listSize--;
              }
     }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */