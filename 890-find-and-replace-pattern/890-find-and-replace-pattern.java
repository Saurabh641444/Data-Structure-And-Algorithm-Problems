class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        
        for(String word :words){
            if(match(word,pattern)) ans.add(word);
        }
        
        return ans;
    }
    
    private boolean match(String s1,String s2){
        HashMap<Character,Character> hm1=new HashMap<>();
        HashMap<Character,Character> hm2=new HashMap<>();
        
        if(s1.length()!=s2.length()) return false;
        
        for(int i=0;i<s1.length();i++){
            char a=s1.charAt(i);
            char b=s2.charAt(i);
            if(!hm1.containsKey(a)){
                hm1.put(a,b);
            }
            
             if(!hm2.containsKey(b)){
                hm2.put(b,a);
            }
            
            if(hm1.get(a)!=b || hm2.get(b)!=a) return false;
        }
       return true;
    }
}