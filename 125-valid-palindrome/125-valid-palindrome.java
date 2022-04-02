class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll(
          "[^a-zA-Z0-9]", "");
         s=s.toLowerCase();
        // System.out.println(s);
        int lo=0;
        int hi=s.length()-1;
        while(lo<=hi){
            
            if(s.charAt(lo)!=s.charAt(hi)){
                return false;
            }
            
            lo++;
            hi--;
        }
        
        return true;
    }
}