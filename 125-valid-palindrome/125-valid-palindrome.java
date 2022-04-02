// class Solution {
//     public boolean isPalindrome(String s) {
//          s = s.replaceAll(
//           "[^a-zA-Z0-9]", "");
//          s=s.toLowerCase();
//         // System.out.println(s);
//         int lo=0;
//         int hi=s.length()-1;
//         while(lo<=hi){
            
//             if(s.charAt(lo)!=s.charAt(hi)){
//                 return false;
//             }
            
//             lo++;
//             hi--;
//         }
        
//         return true;
//     }
// }

class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int lo=0;
        int hi=s.length()-1;
        while(lo<=hi){
            
            while(lo<n && !Character.isLetterOrDigit(s.charAt(lo))){lo++;}
            while(hi>=0 && !Character.isLetterOrDigit(s.charAt(hi))){hi--;}      
            if(lo>hi){break;}
            if(Character.toLowerCase(s.charAt(lo))!=Character.toLowerCase((s.charAt(hi)))){
                return false;
            }
            
            lo++;
            hi--;
        }
        
        return true;
    }
}