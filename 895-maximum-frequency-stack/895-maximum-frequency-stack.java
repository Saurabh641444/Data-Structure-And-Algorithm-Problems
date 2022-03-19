class FreqStack {
     
    private Map<Integer,Integer> freq;
    private TreeMap<Integer,Stack<Integer>> fs;
    public FreqStack() {
        freq=new HashMap<>();
        fs=new TreeMap<>();
    }
    
    public void push(int x) {
       freq.put(x,freq.getOrDefault(x,0)+1);
       fs.computeIfAbsent(freq.get(x),s->new Stack<>()).add(x);    
    }
    
    public int pop() {
        int lastKey=fs.lastKey();
        int x=fs.get(lastKey).pop();
        if(fs.get(lastKey).isEmpty()){
            fs.remove(lastKey);
         }
        freq.put(x,freq.getOrDefault(x,0)-1);
         return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */