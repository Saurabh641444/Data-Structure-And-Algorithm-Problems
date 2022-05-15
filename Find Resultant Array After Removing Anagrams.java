class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
          Stack<String> st=new Stack<>();
    
        for(int i=0;i<words.length;i++){
           int count=0;
           
                
            
                String a=words[i];
                if(st.isEmpty()){
                    st.push(a);
                }else if(!st.isEmpty() && isAnagram(st.peek(),a)){
                    st.push(a);
                }else if(!st.isEmpty() && !isAnagram(st.peek(),a)){
                   while(st.size()!=1){
                       st.pop();
                   }
                    
                    if(st.size()==1){
                        ans.add(st.peek());
                        st.pop();
                    }
                    st.push(a);
                }
                
         
                
            
        }
           if(!st.isEmpty() && !isAnagram(st.peek(),words[words.length-1])){
                   while(st.size()!=1){
                       st.pop();
                   }
                    
                    if(st.size()==1){
                        ans.add(st.peek());
                        st.pop();
                    }
                   
                }else if(!st.isEmpty() && isAnagram(st.peek(),words[words.length-1])){
                  while(st.size()!=1){
                       st.pop();
                   }
                    
                    if(st.size()==1){
                        ans.add(st.peek());
                        st.pop();
                    }
                   
                }
        return ans;
        
    }
    
    public boolean isAnagram(String a, String b){
        String c=sort(a);
                String d=sort(b);
                if(c.equals(d)){
                    return true;
                }
        
        return false;
    }
    
    public String sort(String s){
        char [] temp=s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
