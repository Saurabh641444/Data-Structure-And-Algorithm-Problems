class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int i = 0, j = 0, k = 0, count = 0;
        for(i = 0; i < words.length; i++) {
            j = 0;
            k = 0;
            int index = -1 ;
            int charIndex = -1;
            while(j < s.length() && k < words[i].length()) {
                charIndex = s.indexOf(words[i].charAt(k), index + 1);
                if(charIndex == -1)
                    break;
                else
                    index = charIndex;
                j++;
                k++;
            }
            if(charIndex != -1)
                count++;
        }
        return count;
    }
}