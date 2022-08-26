//{ Driver Code Starts
import java.util.*;
class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			//System.out.println(str.length());
			Solution ob  = new Solution();
			System.out.println(ob.countPS(str));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete below method */

class Solution
{
    long countPS(String str)
    {
        // Your code here
        long [][] dp=new long[str.length()+1][str.length()+1];
        /*
         Suppose the string is str="abca"
         so number of palindromic subsequences would be 7
         those are  "a","b","c","a","aa","aba","aca"
          
          So let's define recursive function helper()
          int i=0, j=str.length()-1;
               
                      abca                  //7
                        |
              1+ bca    +       abc        // 1+6
                / \             / \    
               /   \           /   \
              bc  + ab - b    bc   ab -b   // 3+3
              /\    /\   |    /\   /\  |
              b c  a  b  1    b c  a b  1
              | |  |  |       | |  | |
              1 1  1  1       1 1  1 1
              
              
         
        */
        
        for(long [] arr:dp){
            Arrays.fill(arr,-1);
        }
        
        return helper(str,0,str.length()-1,dp);
        
    }
    
    private static long helper(String s, int i,int j,long [][] dp){
        long m=(long)(Math.pow(10,9)+7);
      if(i>j) return 0;
      
      if(i==j) return 1;
      
      if(dp[i][j]!=-1) return dp[i][j];
      
      if(s.charAt(i)==s.charAt(j)){
          
          dp[i][j]=(1+helper(s,i+1,j,dp)+helper(s,i,j-1,dp))%m;
          
      }else{
          dp[i][j]=(m+helper(s,i+1,j,dp)+helper(s,i,j-1,dp)-helper(s,i+1,j-1,dp))%m;
      }
      
      return dp[i][j];
        
    }
}
