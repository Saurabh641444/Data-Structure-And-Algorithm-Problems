class Solution {
    private char c1[];
    private char c2[];
    private char c3[];
    private boolean inValid[][];
    public boolean isInterleave(String str1, String str2, String str3) {
      
         c1=str1.toCharArray();
         c2=str2.toCharArray();
         c3=str3.toCharArray();
        int m=str1.length();
        int n=str2.length();
        
        inValid=new boolean[m+1][n+1];
        if(m+n!=str3.length()) return false;
        return dfs(0,0,0);
      
    }
    
    private boolean dfs(int i,int j,int k){
        if(inValid[i][j]){
            return false;
        }
        
        if(k==c3.length){
            return true;
        }
        
        boolean valid= i<c1.length && c1[i]==c3[k] && dfs(i+1,j,k+1) ||
                       j<c2.length && c2[j]==c3[k] && dfs(i,j+1,k+1);
        
        if(valid==false) {
            inValid[i][j]=true;
        }
        
        return valid;
    } 
}