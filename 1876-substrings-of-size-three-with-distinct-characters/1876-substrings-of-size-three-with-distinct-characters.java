class Solution {
    public int countGoodSubstrings(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;
        int count=0;
        int ans=0;
        for(;j<s.length();j++){
            
                char ch=s.charAt(j);
                
                     while(set.contains(ch) && i<s.length()){
                        set.remove(s.charAt(i++));     
                     }
                      set.add(ch);
            if(set.size()==3){
                count++;
                set.remove(s.charAt(i++));
                         
                         // i++;
                // j++;
            }
        }
        
        return count;
    }
}