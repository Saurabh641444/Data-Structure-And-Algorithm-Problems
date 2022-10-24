class Solution {
    public int regionsBySlashes(String[] grid) {
        int n=grid.length;
        int N=n+1;
        
        DSU obj=new DSU(N*N,N);
        
        int region=1;
        
        for(int i=0;i<N-1;i++){
            String str=grid[i];
            
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='/'){
                   region+= obj.union(i*N+j+1,(i+1)*N+j);
                }else if(str.charAt(j)=='\\'){
                    region+=obj.union(i*N+j,(i+1)*N+(j+1));

                }
            }
        }
        
        return region;
    }
}

class DSU{
    int root[];
    int rank[];
    
    DSU(int size,int N){
        root=new int[size];
        rank=new int[size];
        
        for(int i=0;i<size;i++){
            if(i%N==0 || i%N==N-1 || i/N==0 || i/N==N-1){
                root[i]=0;
            }else{
                root[i]=i;
            }
        }
    }
    
    int find(int x){
        if(x==root[x]) return x;
        
        return x=find(root[x]);
    }
    
    int union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        
        if(rootX!=rootY){
//             if(rank[rootX]<rank[rootY]){
//                 root[rootX]=rootY;
//             }else if(rank[rootX]>rank[rootY]){
//                 root[rootY]=rootX;
//             }else{
//                 rank[rootY]=rootX;
//                 rank[rootX]++;
//                             return 1;

//             }
            
            root[rootX]=Math.min(rootX,rootY);
            root[rootY]=Math.min(rootX,rootY);
            return 0;

        }
        
        return 1;
    }
}