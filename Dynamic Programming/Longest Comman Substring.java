class Solution{
    int longestCommonSubstr(String S1, String S2, int x, int y){
        // code here
         int[][] t=new int[x+1][y+1];
        for(int i=0;i<=x;i++){ 
            t[i][0]=0;
            
        }
            for(int i=0;i<=y;i++){
              
                t[0][i]=0;
            }
            
            int res=0;
        
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(S1.charAt(i-1)==S2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                    res=Math.max(res,t[i][j]);
                }else{
                    t[i][j]=0;
                }
            }
        
       
        }  
      return res;   
    }
}
