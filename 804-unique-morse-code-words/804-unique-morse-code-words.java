class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String morse[]=new String[]{
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        
        HashSet<String> set=new HashSet<>();
        
        for(String str:words){
            
            StringBuilder code=new StringBuilder();
            
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                code.append(morse[ch-'a']);
            }
            set.add(code.toString());
            
        }
        
        return set.size();
        
    }
}