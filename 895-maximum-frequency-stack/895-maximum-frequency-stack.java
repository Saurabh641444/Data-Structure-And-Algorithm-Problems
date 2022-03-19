// class FreqStack {
     
//     private Map<Integer,Integer> freq;
//     private TreeMap<Integer,Stack<Integer>> fs;
//     public FreqStack() {
//         freq=new HashMap<>();
//         fs=new TreeMap<>();
//     }
    
//     public void push(int x) {
//        freq.put(x,freq.getOrDefault(x,0)+1);
//        fs.computeIfAbsent(freq.get(x),s->new Stack<>()).add(x);    
//     }
    
//     public int pop() {
//         int lastKey=fs.lastKey();
//         int x=fs.get(lastKey).pop();
//         if(fs.get(lastKey).isEmpty()){
//             fs.remove(lastKey);
//          }
//         freq.put(x,freq.getOrDefault(x,0)-1);
//          return x;//O(logN)
//     }
// }

class FreqStack {
     
    private Map<Integer,Integer> freq;
    private Map<Integer,Stack<Integer>> fs;
     private int maxFreq;
    public FreqStack() {
        freq=new HashMap<>();
        fs=new HashMap<>();
        maxFreq=0;
    }
    
    public void push(int x) {
       freq.put(x,freq.getOrDefault(x,0)+1);
       fs.computeIfAbsent(freq.get(x),s->new Stack<>()).add(x);    
       maxFreq=Math.max(maxFreq,freq.get(x));
    }
    
    public int pop() {
      
        int x=fs.get(maxFreq).pop();
        if(fs.get(maxFreq).isEmpty()){
            maxFreq--;
         }
        freq.put(x,freq.getOrDefault(x,0)-1);
         return x;//o(1)tc
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */