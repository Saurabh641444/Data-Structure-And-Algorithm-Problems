class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String s1,String s2,int x,int y)
    {
        //Your code here
        int[][] t=new int[x+1][y+1];
        for(int i=0;i<=x;i++){ 
            t[i][0]=0;
            
        }
            for(int i=0;i<=y;i++){
              
                t[0][i]=0;
            }
        
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        
       
        }  
      return x+y- t[x][y]; 
    }
}
