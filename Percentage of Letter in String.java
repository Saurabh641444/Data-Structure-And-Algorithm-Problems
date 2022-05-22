/*
6074. Percentage of Letter in String
User Accepted:4061
User Tried:5427
Total Accepted:4075
Total Submissions:5925
Difficulty:Easy
Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.

 

Example 1:

Input: s = "foobar", letter = "o"
Output: 33
Explanation:
The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
Example 2:

Input: s = "jjjj", letter = "k"
Output: 0
Explanation:
The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.
 

Constraints:

1 <= s.length <= 100
s consists of lowercase English letters.
letter is a lowercase English letter.
*/

class Solution {
    public int percentageLetter(String s, char letter) {
       HashMap<Character,Integer> hm=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        
        if(!hm.containsKey(letter)) return 0;
        int ans=(hm.get(letter)*100)/s.length();
        
        return ans;
    }
}
