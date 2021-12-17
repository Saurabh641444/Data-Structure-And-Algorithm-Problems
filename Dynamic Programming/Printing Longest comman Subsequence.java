//tabulation method
import java.util.*;  
class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    private static void lcs(int x, int y, String s1, String s2)
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
     // return t[x][y];
     String s="";
     int index=t[x][y];
     int temp=index;

    char[] lcs=new char[index+1];
    lcs[index]='\u0000';

    
     int i=x;
     int j=y;
     
     while(i>0 && j>0){
         if(s1.charAt(i-1)==s2.charAt(j-1)){
                   lcs[index-1]=s1.charAt(i-1);
                    i--;
                    j--;
                   index--;
                }else{
                   if(t[i][j-1]>t[i-1][j]){
                       j--;
                   }else{
                       i--;
                   }
                }
         
         
         
         
         
     }
     for(int k=0;k<=temp;k++)
			System.out.print(lcs[k]);

    //  return lcs[temp];
    
    }
    
    public static void main(String[] args){
       String X = "AGGTAB";
		String Y = "GXTXAY";
		int m = X.length();
		int n = Y.length();
		lcs(m, n, X, Y);
        //System.out.println(s);
    }
    
}
