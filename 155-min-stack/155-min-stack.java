class MinStack {
      Long min=Long.MAX_VALUE;
       Stack<Long> st;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        Long val=Long.valueOf(value);
        if(st.isEmpty()){
            st.push(val);
            min=val;
        }else if(val>min){
            st.push(val);
        }else{
            st.push(val+(val-min));
            min=val;
        }
    }
    
    public void pop() {
               if(st.isEmpty()){
            return ;
        }else if(st.peek()>min){
         st.pop();
        }else{
                   // int oval=min;
                   min=2*min-st.peek();
                   st.pop();
           
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }else if(st.peek()>min){
            return st.peek().intValue();
        }else{
            return min.intValue();
        }
    }
    
    public int getMin() {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */