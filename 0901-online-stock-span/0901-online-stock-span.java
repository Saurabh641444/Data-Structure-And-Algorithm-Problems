class StockSpanner {
    
    /*ArrayList<Integer> arr;
    
    public StockSpanner() {
    arr=new ArrayList<>();
        
    }
    
    public int next(int price) {
        int count=1;
        
        for(int i=arr.size()-1;i>=0;i--){
           if(arr.get(i)>price) {
               break;
           }   
            count++;
        }
        
        arr.add(price);
        
        
        return  count;
    }*/
    
    Stack<int[]> st;
    
    public StockSpanner() {
         st=new Stack<>();
        
      }
    
    public int next(int price) {
        int count=1;
        
        while(!st.isEmpty() && st.peek()[0]<=price){
            count+=st.pop()[1];
        }
        
        st.push(new int[]{price,count});
        
        return  count;
    }
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */