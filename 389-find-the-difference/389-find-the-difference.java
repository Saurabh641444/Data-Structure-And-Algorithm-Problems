class Solution {
    public char findTheDifference(String s, String t) {
        char res=t.charAt(s.length());
        for(int i=0;i<s.length();i++){
            res^=s.charAt(i);
            res^=t.charAt(i);
        }
        return res;
        
        
    }
}