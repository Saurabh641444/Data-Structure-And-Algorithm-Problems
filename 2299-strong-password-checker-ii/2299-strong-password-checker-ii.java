// import java.util.regex.*;
class Solution {
    public boolean strongPasswordCheckerII(String password) {
    
        if(password.length()<8){
            return false;
        }else {
            int same=0;
            for(int i=0;i<password.length()-1;i++){
                if(password.charAt(i)==password.charAt(i+1)){
                    same++;
                }
            }
            
            int upper=0;
            int lower=0;
            int digit=0;
            int special=0;
            for(int i=0;i<password.length();i++){
                char c=password.charAt(i);
                if(c-'0'>=0 && c-'0'<=9){
                    digit++;
                }else if(c-'A'>=0 && c-'A'<26){
                    upper++;
                }
                else if(c-'a'>=0 && c-'a'<26){
                    lower++;
                }else if(c=='!' || c=='@' || c=='#' || c=='$' || c=='%' || c=='^' || c=='&' || 
                        c=='*' || c=='(' || c==')' || c=='-' || c=='+'){
                    special++;
                }
            }
            
            System.out.println(lower);
            if(digit>0 && upper>0 && lower>0 && special>0&&same==0){
                 return true;
              }else {
                return false;
                }
            
            
        }
        
        
        
        
    
    }
    
  
}