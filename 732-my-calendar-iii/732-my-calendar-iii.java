class MyCalendarThree {
    
    private Map<Integer,Integer> hm;
    
    public MyCalendarThree() {
        hm=new TreeMap<>();
    }
    
    public int book(int start, int end) {
        hm.put(start,hm.getOrDefault(start,0)+1);
        hm.put(end,hm.getOrDefault(end,0)-1);
        
        int max=0,curr=0;
        
        for(int val:hm.values()){
            curr+=val;
            max=Math.max(max,curr);
        }
        
        return max;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */