class Solution {
    public boolean validPalindrome(String s) {

        for(int lo=0,hi=s.length()-1;lo<hi;lo++,hi--){
             if(s.charAt(lo)!=s.charAt(hi)){
                int a=lo;
                int b=hi-1;
                int c=lo+1;
                int d=hi;
                while(a<b&& s.charAt(a)==s.charAt(b)){
                     a++;
                b--;
                }
                 while(c<d&& s.charAt(c)==s.charAt(d)){
                         c++;
                d--;
                }
                 
                 return a>=b||c>=d;
            }
        }
        
        return true;
    }
}