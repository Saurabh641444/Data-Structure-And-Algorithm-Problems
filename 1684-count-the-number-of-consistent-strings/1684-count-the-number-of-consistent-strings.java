/*class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(int i=0;i<words.length;i++){
           String str=words[i];
            
            for(int j=0;j<str.length();j++){
                if(!set.contains(str.charAt(j))){
                    break;
                }
                
                if(j==str.length()-1) { count++;}
            }
        }
        
        return count;
        
    }
}*/

// Bit Manipulation Solution

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
         int count=words.length;
           
        int bitset=0;
        
        for(int i=0;i<allowed.length();i++){
            bitset=bitset |(1<<(allowed.charAt(i)-'a'));
        }
        
        for(int i=0;i<words.length;i++){
            String str=words[i];
            for(int j=0;j<str.length();j++){
                if((bitset & (1<<str.charAt(j)-'a'))==0) {count--; break;}
            }
            
        }
        
        return count;
        
    }
}