// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int ans=0;
        int t[][]=new int[x][y];
        
        for(int [] row:t){
            Arrays.fill(row,-1);
        }
       return    helper(x-1,y-1,s1,s2,ans,t);
    }
    
    static int helper(int i,int j,String s1,String s2,int ans,int[][] t){
        
        if(i<0 || j<0) return 0;
        
        if(t[i][j]!=-1) return t[i][j];
        
        if(s1.charAt(i)==s2.charAt(j)){
           
          return t[i][j]=1+ helper(i-1,j-1,s1,s2,ans,t);
        }else{
          return t[i][j]=Math.max (helper(i-1,j,s1,s2,ans,t),helper(i,j-1,s1,s2,ans,t));
        }
        
        
    }
    
}