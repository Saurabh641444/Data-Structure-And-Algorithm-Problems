class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        
        boolean vis[]=new boolean[n];
        
        dfs(rooms,0,vis);
        
        for(int i=0;i<n;i++){
            if(!vis[i]) return false;
        }
        
        return true;
    }
    
    private void dfs(List<List<Integer>> adj,int source,boolean[] vis){
        if(source==adj.size()) return;
        
        vis[source]=true;
        
        List<Integer> g=adj.get(source);
        
        for(Integer x:g){
            if(!vis[x]){
                dfs(adj,x,vis);  
            }
              
        }
    }
}