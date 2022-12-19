class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
        boolean vis[]=new boolean[n];
        
        for(int[] edge:edges){
            int a=edge[0];
            int b=edge[1];
            
            adj.computeIfAbsent(a,val-> new ArrayList<Integer>()).add(b);
            adj.computeIfAbsent(b,val-> new ArrayList<Integer>()).add(a);

        }
        
        return dfs(adj,vis,source,destination);
    }
    
    private boolean dfs(HashMap<Integer,ArrayList<Integer>> adj,boolean[] vis,int curr,int dest){
        if(curr==dest) return true;
        
        if(!vis[curr]){
            vis[curr]=true;
            
            for(int x:adj.get(curr)){
                if(dfs(adj,vis,x,dest)) return true;
            }
        }
        
        return false;
    }
}