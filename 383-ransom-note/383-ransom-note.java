class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            
            if(hm.containsKey(ch)==false){
                return false;
            }else if(hm.get(ch)==0){
                return false;
            }else{
                int val=hm.get(ch);
                val--;
                hm.remove(ch);
                hm.put(ch,val);
            }
        }
        
        return true;
        
    }
}