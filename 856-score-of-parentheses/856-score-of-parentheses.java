class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(count);
                count=0;;
            }else{
               count=st.pop()+Math.max(1,count*2);
            }
        }
        
        return count;
    }
}