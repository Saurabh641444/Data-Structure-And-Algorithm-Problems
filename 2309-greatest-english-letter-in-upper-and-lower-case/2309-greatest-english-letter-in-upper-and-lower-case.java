class Solution {
    public String greatestLetter(String s) {
        char [] upperCase=new char[26];
         char [] lowerCase=new char[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch-'A'>=0 && ch-'A'<26){
                upperCase[ch-'A']++;
            }else  if(ch-'a'>=0 && ch-'a'<26){
                lowerCase[ch-'a']++;
            }
        }
        
        String res="";
        
        for(int i=25;i>=0;i--){
            if(upperCase[i]>0 && lowerCase[i]>0){
                res=res+""+(char)(i+'A');
                break;
            }
        }
        return res;
    }
}