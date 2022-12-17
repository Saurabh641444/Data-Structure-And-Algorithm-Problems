class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        
        
        for(String str:tokens){
         if(str.equals("+")){
             int second=st.pop();
             int first=st.pop();
             st.push(first+second);
             
         }else if(str.equals("-")){
             int second=st.pop();
             int first=st.pop();
             st.push(first-second);
         }else if(str.equals("*")){
             int second=st.pop();
             int first=st.pop();
             st.push(first*second);
         }else if(str.equals("/")){
             int second=st.pop();
             int first=st.pop();
             st.push(first/second);
         }else{
             st.push(Integer.parseInt(str));
         }
            
        }
        
         
        
       return st.pop(); 
    }
}