class Solution {
    public String longestPalindrome(String s) {
        String res="";
        int len=0;
        boolean dp[][]=new boolean[s.length()][s.length()];
        
        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                
                if(s.charAt(i)==s.charAt(j) && (j-i<2 || dp[i+1][j-1]==true)){
                    dp[i][j]=true;
                    
                    if(j-i+1>len){
                        res=s.substring(i,j+1);
                        len=j-i+1;
                    }
                }
            }
        }
        
        return res;
    }
}