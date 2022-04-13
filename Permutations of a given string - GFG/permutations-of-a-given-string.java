// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
     List<String> ans=new ArrayList<>();
    public List<String> find_permutation(String S) {
        // Code here
       
       solve(S, "");
        Collections.sort(ans);
         return ans; 
      
    }
    
    public void solve(String s,String op){
        if(s.length()==0 ) {
            ans.add(op);
            return ;}
       
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String lip=s.substring(0,i);
            String rip=s.substring(i+1);
            String ip1=lip+rip;
            String op1=op+c;
            solve(ip1,op1);
        }
        
    }
}