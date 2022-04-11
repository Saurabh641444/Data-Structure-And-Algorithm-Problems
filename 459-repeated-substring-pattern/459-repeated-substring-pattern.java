/*class Solution {
    public boolean repeatedSubstringPattern(String s) {
    if(s.length()==0 || s.length()==1) return false;
    
    return helper(s,""+s.charAt(0),1);
    }

     public boolean helper(String s,String repeat,int plus){
          if(s.equals(repeat)) return false;
           
          int i=0;
          while(i<s.length()){
                   if(i+repeat.length()<=s.length() &&
repeat.equals(s.substring(i,i+repeat.length()))){
             i=i+repeat.length();
        }else{
                 return helper(s,s.substring(0,plus+1),plus+1); 
               }
             }
       return true;
      }
}*/

/*class Solution {
    public boolean repeatedSubstringPattern(String s) {
     
         int n=s.length();
       
        for(int j=n/2;j>0;j--){
            if(n%j==0){
            int i=0;
           while(j+i<n&& s.charAt(i)==s.charAt(j+i))
              i++;
           if(j+i==n){ return true;}
           
        }
        
       
        }
         return false;
      }
}*/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
return (s+s).substring(1,2*s.length()-1).contains(s);
      }
}