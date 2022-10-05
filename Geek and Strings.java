//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String li[] = new String[N];
            for(int i=0; i<N; i++)
                li[i] = in.readLine();
            int Q = Integer.parseInt(in.readLine());
            String query[] = new String[Q];
            for(int i=0; i<Q; i++)
                query[i] = in.readLine();
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.prefixCount(N, Q, li, query);
            for(int i = 0;i < ans.size();i++)
                System.out.println(ans.get(i));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> prefixCount(int N, int Q, String li[], String query[])
    {
        // code here
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        
        List<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<N;i++){
            int len=li[i].length();
            
            for(int j=1;j<=len;j++){
                
                String str=li[i].substring(0,j);
                
                if(!hm.containsKey(str)){
                    hm.put(str,1);
                }else{
                    hm.put(str,hm.get(str)+1);
                }
                
            }
            
          
        }
        
        for(int i=0;i<Q;i++){
            if(hm.containsKey(query[i])){
                ans.add(hm.get(query[i])==null ? 0 :( hm.get(query[i])));
            }else{
                ans.add(0);
            }
        }
        
        return ans;
    }
}
