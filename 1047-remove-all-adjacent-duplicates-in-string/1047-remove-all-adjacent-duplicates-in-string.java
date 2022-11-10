class Solution {
    public String removeDuplicates(String s) {
       
     
//        Stack<Character> st=new Stack<>();
//        st.push(s.charAt(0));
        
//          for(int i=1;i<s.length();i++){
//           char ch=s.charAt(i);
//           if(st.size()>0 && st.peek()==ch){
//               st.pop();
//           }else{
//               st.push(ch);
//           }   
           
//         }
        
        StringBuilder ans=new StringBuilder(s);
        
        // while(!st.isEmpty()){
        //     ans.append(st.pop());
        // }
        // ans.reverse();
        
        int i=0;
        
        while(i<ans.length()-1){
            if(ans.charAt(i)==ans.charAt(i+1)){
                ans.deleteCharAt(i);
                ans.deleteCharAt(i);
                if(i>0) i--;
            }else{
                i++;
            }
        }
        return ans.toString();
    }
}