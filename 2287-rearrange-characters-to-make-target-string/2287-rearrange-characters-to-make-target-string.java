class Solution {
    public int rearrangeCharacters(String s, String target) {
        
int[] freq1=new int[26];
int[] freq2=new int[26];

   for( int i=0;i<target.length();i++){

    freq2[target.charAt(i)-'a']++;}

   for( int i=0;i<s.length();i++){

    freq1[s.charAt(i)-'a']++;}

    int min=Integer.MAX_VALUE;
     
   for(char ch: target.toCharArray()){
       min=Math.min(min,freq1[ch-'a']/freq2[ch-'a']);
      }

   return min;
        
    }
   
   
}