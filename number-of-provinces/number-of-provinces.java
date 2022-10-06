class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int n=isConnected.length;
        UnionFind obj=new UnionFind(n);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    obj.union(i,j);
                }
            }
        }
        
        return obj.getCount();
    }
}

class UnionFind{
    int rank[];
    int root[];
    int count;
    
    UnionFind(int V){
        rank=new int[V];
        root=new int[V];
         count=V;
        for(int i=0;i<V;i++){
            rank[i]=1;
            root[i]=i;
        }
        
    }
    
    int find(int x){
        if(x==root[x]){
          return x;
         }
        
        return x=find(root[x]);
    }
    
    void union(int x,int y){
       int rootX=find(x);
       int rootY=find(y);
        
        if(rootX!=rootY){
            
            if(rank[rootX]>rank[rootY]){
                root[rootY]=rootX;
            }else if(rank[rootX]<rank[rootY]){
                root[rootX]=rootY;
            }else{
                root[rootY]=rootX;
                rank[rootX]+=1;
                
            }
            
            count--;
        }
    }
    
    int getCount(){
        return count;
    }
    
}