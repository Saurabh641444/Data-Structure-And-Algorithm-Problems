// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        int i=0;
        int j=0;
        int max=0;
        HashSet<Character> set=new HashSet<>();


while(j<S.length()){
            char ch=S.charAt(j);
           
            if(set.contains(ch)==false){
                set.add(ch);
                j++;
                max=Math.max(set.size(),max);
            }else{
                set.remove(S.charAt(i));
                i++;
            }     
       
        }
        return max;
    }
}