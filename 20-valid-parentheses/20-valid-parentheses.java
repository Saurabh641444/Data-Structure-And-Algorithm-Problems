class Solution {
    public boolean isValid(String str) {
        Stack<Integer> s=new Stack<>();
        
           for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                  s.push(i);   
                 }
           else if(s.isEmpty() && ((str.charAt(i)==')')|| str.charAt(i)=='}'||(str.charAt(i)==']')))
             {
               return false;
                }
            else if((str.charAt(i)==')' && str.charAt(s.peek())=='(') ||  (str.charAt(i)=='}' && str.charAt(s.peek())=='{')   ||(str.charAt(i)==']' && str.charAt(s.peek())=='[')  )  
              {
                 s.pop();
                 }  

              else{
                   s.push(i);  
                   }          
              }
           
            if(s.size()==0){return true;}
            else{ return false;}
    }
}