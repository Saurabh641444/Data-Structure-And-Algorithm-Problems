class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1=word1.length;
        int n2=word2.length;
        String str1="";
        for(String s:word1){
            str1=str1+s;
        }
        
         String str2="";
        for(String s:word2){
            str2=str2+s;
        }
        // System.out.println(str1);
        // System.out.println(str2);
        
        if(str1.equals(str2)){
            return true;
        }
        
        return false;
    }
}