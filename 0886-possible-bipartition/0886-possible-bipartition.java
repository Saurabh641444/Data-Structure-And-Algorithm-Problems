class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        
        Map<Integer,ArrayList<Integer>> adj=new HashMap<>();
        
        for(int edge[]:dislikes){
         
            adj.computeIfAbsent(edge[0],value->new ArrayList<>()).add(edge[1]);
            adj.computeIfAbsent(edge[1],value->new ArrayList<>()).add(edge[0]);
        
        }
        int color[]=new int[n+1];
        Arrays.fill(color,-1);
        
        for(int i=1;i<=n;i++){
            if(color[i]==-1){
                if(!bfs(adj,i,color)) return false;
            }
        }
        
        return true;
        
    }
    
    private boolean bfs(Map<Integer,ArrayList<Integer>> adj,int curr,int[] color){
        Queue<Integer> q=new LinkedList<>();
        q.offer(curr);
        
        color[curr]=0;
        
        while(!q.isEmpty()){
            int node=q.poll();
            
            if(adj.get(node)==null) continue;
            
            for(int x:adj.get(node)){
                if(color[x]==color[node]) return false;
                
                if(color[x]==-1){
                    color[x]=1-color[node];
                    q.add(x);
                }
            }
        }
        
       return true; 
    }
    
    private boolean dfs(Map<Integer,ArrayList<Integer>> adj,int curr,int nodeColor,int[] color){
       
        color[curr]=nodeColor;
        
        if(adj.get(curr)==null) return true;
        ArrayList<Integer> edge=adj.get(curr);
       
        for(Integer x:edge){
            if(color[x]==color[curr]) return false;
            
            if(color[x]==-1){
                if(!dfs(adj,x,1-nodeColor,color)){
                    return false;
                }
            }
        }
        
        return true;
    }
}