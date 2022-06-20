class Solution {
    public int minimumLengthEncoding(String[] words) {
        HashSet<String> hs=new HashSet<>(Arrays.asList(words));

        for(String s:words){
              for(int i=1;i<s.length();i++){
                hs.remove(s.substring(i)); 
                }
           }
     
        int len=0;
      
        for(String s:hs){
             len+=s.length()+1;
            }
        return len;
    }
}