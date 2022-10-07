class MyCalendarTwo {
    TreeMap<Integer,Integer> hm;
    
    public MyCalendarTwo() {
       hm=new TreeMap<>();    
    }
    
    public boolean book(int start, int end) {
        hm.put(start,hm.getOrDefault(start,0)+1);
        hm.put(end,hm.getOrDefault(end,0)-1);
        
        int active=0;
        
        for(int val:hm.values()){
            active+=val;
            
            if(active>=3){
                hm.put(start,hm.getOrDefault(start,0)-1);
                hm.put(end,hm.getOrDefault(end,0)+ 1);
                
                if(hm.get(start)==0)hm.remove(start);
                return false;
            }
        }
        
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */