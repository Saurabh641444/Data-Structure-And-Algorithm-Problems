class Solution {
    public int[] findRedundantDirectedConnection(int[][] edges) {
       Map<Integer,Integer> hm=new HashMap<>();
        
        int nodeB=-1;
        for(int []edge:edges){
            hm.put(edge[1],hm.getOrDefault(edge[1],0)+1);
            if(hm.get(edge[1])==2) nodeB=edge[1];
        }
        
        if(nodeB==-1){
            return findRedundantConnection(edges,nodeB);
        }else{
            for(int i=edges.length-1;i>=0;i--){
                if(edges[i][1]==nodeB){
                   int res[]= findRedundantConnection(edges,i);
                 if(res==null) return edges[i];
                }
            }
        }
        return null;
    }
    
    private int[] findRedundantConnection(int[][] edges,int skip){
         DSU obj=new DSU(1001);
      
        
        for(int i=0;i<edges.length;i++){
            if(i==skip) continue;
            if(obj.union(edges[i][0],edges[i][1])==false) return new int[]{edges[i][0],edges[i][1]};
        }
        
        return null;
    }
}

class DSU{
    int root[];
    int rank[];
    
    DSU(int size){
        root=new int[size];
        for(int i=0;i<size;i++){
            root[i]=i;
        }
        rank=new int[size];
    }
    
    int find(int x){
        
        if(x==root[x]) return x;
        
        return x=find(root[x]);
    }
    
    boolean union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        
        if(rootX==rootY){
            return false;
        }else if(rank[rootX]<rank[rootY]){
            root[rootX]=rootY;
        }else if(rank[rootX]>rank[rootY]){
            root[rootY]=rootX;
            
        }else{
            root[rootY]=rootX;
            rank[rootX]++;
        }
        
        return true;
    }
}