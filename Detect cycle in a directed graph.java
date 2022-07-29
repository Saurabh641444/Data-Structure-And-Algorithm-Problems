//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int visited[]=new int[V];
        int disvis[]=new int[V];
        
        Arrays.fill(visited,0);
        Arrays.fill(disvis,0);
        
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                if(dfs(adj,i,visited,disvis)) return true;
            }
        }
        
        return false;
    }
    
    private boolean dfs(ArrayList<ArrayList<Integer>> adj,int s,int [] vis,int disvis[]){
        vis[s]=1;
        disvis[s]=1;
        
        for(Integer i:adj.get(s)){
            if(vis[i]==0){
                if(dfs(adj,i,vis,disvis)) return true;
            }else if(disvis[i]==1) return true;
        }
        disvis[s]=0;
        return false;
    }
}
