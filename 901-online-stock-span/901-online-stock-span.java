public class Pair{
    int key;
    int value;
    Pair(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class StockSpanner {
     Stack<Pair> st;
    public StockSpanner() {
        st=new Stack<Pair>();
    }
    
    int count=-1;
    public int next(int price) {
        count++;
        
        if(st.isEmpty()){
            st.push(new Pair(count,price));
            return count+1;
        }else{
            if(price<st.peek().value){
            st.push(new Pair(count,price));
            return 1;}
        else {
            while(!st.isEmpty() && price>=st.peek().value){st.pop();}
           if(st.isEmpty()){
            st.push(new Pair(count,price));
            return count+1;
        }else {
               int span= count-st.peek().key;
            st.push(new Pair(count,price));
            return span;
           }
        }}
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */