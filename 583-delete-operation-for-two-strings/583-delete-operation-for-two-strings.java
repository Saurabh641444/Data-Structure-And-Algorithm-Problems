class Solution {
    public int minDistance(String word1, String word2) {
    
        int t[][]=new int[word1.length()+1][word2.length()+1];
        
        for(int[] row:t){                   
        Arrays.fill(row,-1);
        }
                           
     return (word1.length()+word2.length())-              2*lcs(word1,word2,word1.length(),word2.length(),t);
        
    }
                           
    private int lcs(String str1,String str2,int m,int n, int[][] t){
        if(n==0||m==0){
            return 0;
        }
        
        if(t[m][n]!=-1) return t[m][n];
        
        if(str1.charAt(m-1)==str2.charAt(n-1)){
         return   t[m][n]=1+lcs(str1,str2,m-1,n-1,t);
        }else{
           return t[m][n]=Math.max(lcs(str1,str2,m-1,n,t),lcs(str1,str2,m,n-1,t));
        }
        
        
        
    }
                           
}