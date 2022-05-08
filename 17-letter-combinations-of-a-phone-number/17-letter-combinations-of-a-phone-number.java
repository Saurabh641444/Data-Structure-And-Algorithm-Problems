class Solution {
    private static String[] codes=new String []{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
       
       if(digits.length()==0){
           List<String> bans=new ArrayList<>();
           // bans.add(""+codes[0]);
           return bans;
       }
        
      return solve(digits);
        
    }
    
        public List<String> solve(String digits) {
       
       if(digits.length()==0){
           List<String> bans=new ArrayList<>();
           bans.add("");
           return bans;
       }
        
        char ch=digits.charAt(0);
        String ros=digits.substring(1);
        
        List<String> res=solve(ros);
        List<String> ans=new ArrayList<>();
        
        String codesforch=codes[ch-'0'];
        for(int i=0;i<codesforch.length();i++){
            char chr=codesforch.charAt(i);
            for(String s:res){
                ans.add(chr+s);
            }
        }
        
        return ans;
        
    }
}