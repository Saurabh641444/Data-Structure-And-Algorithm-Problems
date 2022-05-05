/*class MyStack {

    Queue<Integer> q;
    ArrayList<Integer> list;
    public MyStack() {
        q=new LinkedList<>();
        list=new ArrayList<>();
    }
    
    public void push(int x) {
        q.add(x);
        list.add(x);
    }
    
    public int pop() {
        
        while(!q.isEmpty()){
            q.poll();
        }
        
        int k=list.get(list.size()-1);
        list.remove(list.size()-1);
        for(Integer l :list){
            q.offer(l);
        }
        
        return k;
        
    }
    
    public int top() {
        
        return list.get(list.size()-1);
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
*/
class MyStack {

    Queue<Integer> q;
   
    public MyStack() {
        q=new LinkedList<>();
       
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++){
            q.add(q.remove());
        }
        
    }
    
    public int pop() {
        
       
        
        int k=q.remove();
        return k;
        
    }
    
    public int top() {
        
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */