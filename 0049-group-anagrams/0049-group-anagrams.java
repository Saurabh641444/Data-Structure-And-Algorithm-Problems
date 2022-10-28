class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        
        HashMap<HashMap<Character,Integer>,List<String>> 
            hm=new HashMap<>();
        
        for(String str:strs){
            HashMap<Character,Integer> hm1=new HashMap<>();
            
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                hm1.put(ch,hm1.getOrDefault(ch,0)+1);
            }
            
            if(hm.containsKey(hm1)==false){
                List<String> list=new ArrayList<>();
                list.add(str);
                hm.put(hm1,list);
            }else{
                List<String> list=hm.get(hm1);
                list.add(str);
            }
        }
        
        for(List<String> val:hm.values()) ans.add(val);
        
        return ans;
    }
}