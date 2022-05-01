class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
         
 	for(char ch:s.toCharArray()){
	    if(ch=='#'){
	      if(!st1.isEmpty()){
		st1.pop();
             
          
          }   continue;    
        }	
        st1.push(ch);
    }
    	
	
    
    for(char ch:t.toCharArray()){
	    if(ch=='#'){
	      if(!st2.isEmpty()){
		st2.pop();
          
          } 
            continue;
        }
         st2.push(ch);
    }
   	
	
    
    String s1="";
    String s2="";

     while(!st1.isEmpty()){
         s1+=st1.pop();
     }

    while(!st2.isEmpty()){
         s2+=st2.pop();
     }
    
    return s1.equals(s2);
    }
}