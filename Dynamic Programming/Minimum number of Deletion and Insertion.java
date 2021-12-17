class Solution
{
	public int minOperations(String s1, String s2) 
	{ 
	    // Your code goes here
	    
	    int x=s1.length();
	    int y=s2.length();
	    
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

      // minimum number of insertion y-LCS
       // minimum number of deletion x-LCS
      return x+y - 2*t[x][y]; 
	    
	} 
}
