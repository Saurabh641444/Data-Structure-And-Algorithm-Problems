class MedianFinder {
   
    PriorityQueue<Integer> small;
    PriorityQueue<Integer> big;
    
    public MedianFinder() {
          small=new PriorityQueue<>(Collections.reverseOrder());
          big=new PriorityQueue<>();
        
         }
    
    public void addNum(int num) {
        small.add(num);
        big.add(small.poll());
        
        if(big.size()>small.size()){
            small.add(big.poll());
        }
        
    }
    
    public double findMedian() {
        
        if(small.size()!=big.size()) return small.peek();
         
        return (small.peek()+big.peek())/2.0;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */