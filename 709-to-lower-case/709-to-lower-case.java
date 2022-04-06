class Solution {
    public String toLowerCase(String s) {
        
        // return s.toLowerCase();
        
        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch>='A' && ch<='Z'){
                char small=(char)(ch+32);
                res.append(small);
            }else{
                res.append(ch);
            }
        }
        
        return res.toString();
    }
}