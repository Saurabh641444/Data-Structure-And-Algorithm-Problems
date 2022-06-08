class Solution {
    public int removePalindromeSub(String s) {
        
        if(s.isEmpty()) return 0;
        StringBuilder str=new StringBuilder(s);
       
        
        if(s.equals(str.reverse().toString())) {return 1;}
        else{ return 2;}
        
    }
}