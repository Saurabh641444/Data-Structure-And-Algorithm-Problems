class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        
        if(s.length()!=t.length()) return false;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c, 0)+1);
        }
          
        int count=0;
          for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
                if(!hm.containsKey(c)){ return false;}
           if(hm.containsKey(c)){
               count++;
               hm.put(c,hm.get(c)-1);
           }
        }
        
        for(Integer i:hm.values()){
            if(i!=0){
                return false;
            }
        }
        
        return true;
    }
}