class UnionFind{
      
    int parent[];
    int rank[];
    
    UnionFind(int n){
        parent=new int[n];
        rank=new int[n];
        
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        
    }
    
    int find(int x){
        if(parent[x]==x) return x;
        return parent[x]=find(parent[x]);
    }
    
    void union(int x,int y){
        int parentX=find(x);
        int parentY=find(y);
        
        if(parentX!=parentY){
            if(rank[parentX]>rank[parentY]){
                parent[parentY]=parentX;
            }else if(rank[parentX]<rank[parentY]){
                parent[parentX]=parentY;
            }else{
                parent[parentY]=parentX;
                rank[parentX]++;
                
            }
        }
    }
      
}

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
//         HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
//         boolean vis[]=new boolean[n];
        
//         for(int[] edge:edges){
//             int a=edge[0];
//             int b=edge[1];
            
//             adj.computeIfAbsent(a,val-> new ArrayList<Integer>()).add(b);
//             adj.computeIfAbsent(b,val-> new ArrayList<Integer>()).add(a);

//         }
        
//         return dfs(adj,vis,source,destination);
        
           UnionFind obj=new UnionFind(n);
        
           for(int edge[]:edges){
               obj.union(edge[0],edge[1]);
           }
        
           return obj.find(source)==obj.find(destination);
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