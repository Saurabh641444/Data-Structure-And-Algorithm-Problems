class MyCalendar {
    TreeMap<Integer,Integer> cal;
    public MyCalendar() {
        cal=new TreeMap<Integer,Integer>();
    }
    
    public boolean book(int start, int end) {
        Map.Entry<Integer,Integer> last=cal.lowerEntry(end);
        
        if(last!=null && last.getValue()>start){
            return false;
        }
        
        cal.put(start,end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */