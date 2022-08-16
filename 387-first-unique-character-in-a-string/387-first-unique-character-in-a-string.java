class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm=new LinkedHashMap<>();
        HashMap<Character,Integer> index=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            index.put(ch,i);
        }
        
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            char ch=e.getKey();
            int val=e.getValue();
            
            if(val==1) return index.get(ch);
        }
        
        return -1;
    }
}