class Solution {
    
    class Pair{
        int index;
        int value;
        
        Pair(int index,int value){
             this.index=index;
             this.value=value;
        }
        
        int getIndex() { return index;}
        
        int getValue(){return value;}
        
      }
    
    public int[] dailyTemperatures(int[] temperatures) {
       /* int n=temperatures.length;
        
        int[] ans=new int[n];
        
        Stack<Pair> st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(new Pair(i,temperatures[i]));
                ans[i]=0;
            }else if(st.peek().getValue()>temperatures[i] ){
                ans[i]=st.peek().getIndex()-i;
                st.push(new Pair(i,temperatures[i]));
            }else{
                
                while(!st.isEmpty() && st.peek().getValue()<=temperatures[i]){
                    st.pop();
                }
                
                 if(st.isEmpty()){
                    st.push(new Pair(i,temperatures[i]));
                    ans[i]=0;
                  }else if(st.peek().getValue()>temperatures[i] ){
                    ans[i]=st.peek().getIndex()-i;
                    st.push(new Pair(i,temperatures[i]));
                  }
                
            }
        }
        
        return ans;*/
        int n=temperatures.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                ans[st.peek()]=i-st.pop();
            }
            
            st.push(i);
        }
        
        return ans;
    }
}