/*class Solution {
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
}*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        
        HashMap<String,List<String>> 
            hm=new HashMap<>();
        
        for(String str:strs){
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(hm.containsKey(s)==false){
                hm.put(s,new ArrayList<>());
                hm.get(s).add(str);
            }else {
                hm.get(s).add(str);
                
            }
        }
        
       
        
        return new ArrayList<>(hm.values());
    }
}