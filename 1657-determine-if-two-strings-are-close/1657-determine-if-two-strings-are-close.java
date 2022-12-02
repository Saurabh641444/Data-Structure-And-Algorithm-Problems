class Solution {
    public boolean closeStrings(String word1, String word2) {
        int [] bucket1=new int[26];
        int [] bucket2=new int[26];
        
        if(word1.length()!=word2.length()) return false;
        
        for(int i=0;i<word1.length();i++){
            bucket1[word1.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<word2.length();i++){
            bucket2[word2.charAt(i) - 'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(bucket1[i]==0 && bucket2[i]!=0){
                return false;
            }
            
            if(bucket1[i]!=0 && bucket2[i]==0){
                return false;
            }
        }
        
        Arrays.sort(bucket1);
        Arrays.sort(bucket2);
        
        for(int i=0;i<26;i++){
            if(bucket1[i] != bucket2[i]) return false;
        }
        
        return true;
    }
}