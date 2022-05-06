 class Pair{
    char key;
    int value;
    String res;
    Pair(char key,int value, String res){
        this.key=key;
        this.value=value;
        this.res=res;
    }
    
}


class Solution {
    public String removeDuplicates(String s, int k) {
      Stack<Pair> st=new Stack<Pair>();
       String ans="";
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty()){
                if(st.peek().key==ch){ 
                int val=st.peek().value+1;
                String res1=st.peek().res+""+ch;
                    st.pop();
                Pair p=new Pair(ch,val,res1);
                st.push(p); 
                }else{
               int val=1;
                String res1=""+ch;
                Pair p=new Pair(ch,val,res1);
                st.push(p);   
                }
               
            }else{
                Pair p=new Pair(ch,1,""+ch);
                st.push(p);
            }
            while(!st.isEmpty()&& k==st.peek().value){
                st.pop();
            }
        }
        
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            int count=st.peek().value;
            char ch=st.peek().key;
            // System.out.println(count+" :"+ch);
            // for(int i=0;i<count;i++){
            //     ans+=""+ch;
            // }
            
            sb.append(st.peek().res);
            st.pop();
        }
        sb.reverse();
        return sb.toString();
    }
}