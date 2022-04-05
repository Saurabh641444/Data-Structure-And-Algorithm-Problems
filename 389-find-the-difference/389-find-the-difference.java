class Solution {
    public char findTheDifference(String s, String t) {
//         char res=t.charAt(s.length());
//         for(int i=0;i<s.length();i++){
//             res^=s.charAt(i);
//             res^=t.charAt(i);
//         }
//         return res;
        
        char ch=0;
        for(char i:s.toCharArray()){
            ch^=i;
        }
        
        for(char i:t.toCharArray()){
            ch^=i;
        }
        
        
        return ch;
    }
}