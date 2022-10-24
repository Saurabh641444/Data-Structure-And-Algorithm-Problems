class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        DSU obj=new DSU(1001);
        
        for(int [] edge:edges){
            if(obj.union(edge[0],edge[1])==false) return edge;
        }
        throw new AssertionError();
    }
}

class DSU{
    
    int [] rank;
    int [] parent;
 
    DSU(int size){
        rank=new int[size];
        parent=new int[size];
        
        for(int i=0;i<size;i++)parent[i]=i;
    }
    
    int find(int x){
        if(x==parent[x]){
            return x;
        }
        
        return x=find(parent[x]);
    }
    
    boolean union(int x,int y){
       int parent_X=find(x);
       int parent_Y=find(y);
        
        if(parent_X==parent_Y){
            return false;
        }else if(rank[parent_X]<rank[parent_Y]){
            parent[parent_X]=parent_Y;
        }else if(rank[parent_X]>rank[parent_Y]){
            parent[parent_Y]=parent_X;
        }else{
            parent[parent_Y]=parent_X;
            rank[parent_X]++;
        }
        
        return true;
    }
    
}