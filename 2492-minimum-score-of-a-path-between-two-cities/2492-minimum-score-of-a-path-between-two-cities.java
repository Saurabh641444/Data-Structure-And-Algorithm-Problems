class Solution {
   
    public int minScore(int n, int[][] roads) {
        
       ArrayList<Integer> adj[]=new ArrayList[n];
       ArrayList<Integer> cost[]=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<Integer>();
            cost[i]=new ArrayList<Integer>();
        }
        
        for(int road[]:roads){
            int u=road[0]-1,v=road[1]-1,w=road[2];
            
            adj[u].add(v);
            adj[v].add(u);
            cost[u].add(w);
            cost[v].add(w);
        }
        
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean vis[]=new boolean[n];
        vis[0]=true;
        int min=Integer.MAX_VALUE;
        
        while(!q.isEmpty()){
            int u=q.poll();
            
            for(int v:adj[u]){
                if(!vis[v]){
                    vis[v]=true;
                    q.add(v);
                }
            }
            
            for(int w:cost[u]){
                min=Math.min(min,w);
            }
        }
        
        return vis[n-1]?min:-1;
    }
    
   
}

