class Solution {
    public int removeStones(int[][] stones) {
        int n=stones.length;
        UnionFind obj=new UnionFind(n);
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(stones[i][0] == stones[j][0] || stones[i][1]==stones[j][1]){
                    obj.union(i,j);
                }
            }
        }
        
        return n- obj.getCount();
    }
}

class UnionFind{
    
    int rank[];
    int parent[];
    int count;
    
    UnionFind(int n){
        rank=new int[n];
        count=n;
        parent=new int[n];
        
        for(int i=0;i<n;i++){
            rank[i]=0;
            parent[i]=i;
        }
    }
    
    void union(int x, int y){
        int rootX=findParent(x);
        int rootY=findParent(y);
        
        if(rootX!=rootY){
            if(rank[rootX]<rank[rootY]){
                parent[rootX]=rootY;
            }else if(rank[rootX]>rank[rootY]){
                parent[rootY]=rootX;
            }else{
                 parent[rootY]=rootX;
                rank[rootX]++;
            }
            
            count--;
        }
    }
    
    int findParent(int x){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=findParent(parent[x]);
    }
    
    int getCount(){
        return count;
    }
    
}