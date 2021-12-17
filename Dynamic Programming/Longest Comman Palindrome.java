//tabulation method
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        
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
      return t[x][y];   
    }
    
        public static void main(String[] args){
       String X = "bbbab";
// 		String Y = "babbb";
        String Y="";
        char ch;
		 
		       for (int i=0; i<X.length(); i++)
      {
        ch= X.charAt(i); //extracts each character
        Y= ch+Y; //adds each character in front of the existing string
      }
		int m = X.length();
		int n = Y.length();
		int s=lcs(m, n, X, Y);
        System.out.println(s);
    }
    
}
