/*class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();
        String str2="";
        for(int i=0;i<words1.length;i++){
            String str=words1[i];
            int count=0;
            for(int j=0;j<words2.length;j++){
                if(helper(str,words2[j])) count++;
                if(count==words2.length) ans.add(str);
            }
            System.out.println(count);
        }
        
        return ans;
    }
    
    private boolean helper(String s1,String s2){
        
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        
        for(int i=0;i<s1.length();i++){
            hm1.put(s1.charAt(i),hm1.getOrDefault(s1.charAt(i),0)+1);
        }
        
         for(int i=0;i<s2.length();i++){
            hm2.put(s2.charAt(i),hm2.getOrDefault(s2.charAt(i),0)+1);
        }
        
        for(int i=0;i<s2.length();i++){
            if(hm1.containsKey(s2.charAt(i))==false) return false;
            
            if(hm1.get(s2.charAt(i))<hm2.get(s2.charAt(i))) return false;
        }
        
        return true;
    }
}*/

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();
       
        int target[]=new int [26];
        
        for(String str: words2){
            int temp[]=new int[26];
            
            for(char ch:str.toCharArray()){
               temp[ch-'a']++;
                target[ch-'a']=Math.max( target[ch-'a'], temp[ch-'a']);
            }
        }
        
        
         for(String str: words1){
            int source[]=new int[26];
            
            for(char ch:str.toCharArray()){
               source[ch-'a']++;
            }
             
             if(isSubset(source,target)){
                 ans.add(str);
             }
        }
        return ans;
    }
    
    private boolean isSubset(int [] source, int [] target){
        
        for(int i=0;i<26;i++){
            if(source[i]<target[i]) return false;
        }
            
            return true;
    }
    
    
}