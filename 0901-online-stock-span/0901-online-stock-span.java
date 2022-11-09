class StockSpanner {
    
    ArrayList<Integer> arr;
    
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
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */