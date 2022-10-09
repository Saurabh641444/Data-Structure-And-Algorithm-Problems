class Solution {
    public String robotWithString(String s) {
        StringBuilder ans=new StringBuilder();
     
        Stack<Character> st=new Stack<>();
        
        TreeMap<Character,Integer> hm=new TreeMap<>();
        
        int n=s.length();
        int count=0;
        
        for(int i=0;i<n;i++){
           char ch=s.charAt(i);
           hm.put(ch,hm.getOrDefault(ch,0)+1); 
        }
        
        for(int i=0;i<n;i++){
           char ch=s.charAt(i);
          
            if(!st.isEmpty() && st.peek()<=hm.firstKey()){
                while(!st.isEmpty() && st.peek()<=hm.firstKey()){
                    ans.append(st.pop());
                }
            }
            
            st.push(ch);
            hm.put(ch,hm.get(ch)-1);
            
            if(hm.get(ch)<=0){
                hm.remove(ch);
            }
        }
        
        while(!st.isEmpty()){
            ans.append(st.pop());
            }
        
        return ans.toString();
    }
}