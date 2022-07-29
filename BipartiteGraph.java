//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int color[]=new int[V];
        Arrays.fill(color,-1);
        
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(bfs(adj,i,color)==false){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean bfs(ArrayList<ArrayList<Integer>>adj,int s,int[] color){
        if(color[s]==-1) color[s]=1;
        
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        
        while(!q.isEmpty()){
            int temp=q.poll();
            
            for(Integer i:adj.get(temp)){
                if(color[i]==-1){
                    q.add(i);
                    color[i]=1-color[temp];
                }else if(color[i]==color[temp]) return false;
            }
        }
        return true;
    }
    
    private boolean dfs(ArrayList<ArrayList<Integer>>adj,int s,int[] color){
        
        if(color[s]==-1){
            color[s]=1;
        }
        
        for(Integer i:adj.get(s)){
            if(color[i]==-1){
                color[i]=1-color[s];
                if(!dfs(adj,i,color)){
                    return false;
                }
            }else if(color[i]==color[s]){
                return false;
            }
        }
        
        return true;
        
    }
}
