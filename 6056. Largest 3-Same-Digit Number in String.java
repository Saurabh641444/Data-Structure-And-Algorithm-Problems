class Solution {
    public String largestGoodInteger(String num) {
        Stack<Integer> st=new Stack<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            int val=Integer.parseInt(String.valueOf(ch));
              // System.out.println("val1="+val);
            
                while(!st.isEmpty()&& st.peek()!=val){
                    // System.out.println("val="+val);
                    // System.out.println("peek="+st.peek());
                    st.pop();
                }
      
            
            st.push(val);
                 if(st.size()==3){
                int maxN=st.peek();
                
                max=Math.max(max,maxN);
                
                while(!st.isEmpty()){
                    st.pop();
                }
            }
            System.out.println(st.size());
            
        }
        
        if(st.size()==3){
                int maxN=st.peek();
                
                max=Math.max(max,maxN);
                
                while(!st.isEmpty()){
                    st.pop();
                }
            }
        
        String ans="";
        if(max==Integer.MIN_VALUE){ return ans;}
        for(int i=0;i<3;i++){
            ans+=Integer.toString(max);
        }
        
        return ans;
    }
}
