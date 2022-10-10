class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
        int rows=grid.length;
        int cols=grid[0].length;
        
        UnionFind obj=new UnionFind(rows*cols);
        
        int noOfSets=0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    noOfSets++;
                }
            }
        }
        
        int max=0;
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    
                 
                    int p1=obj.find(i*cols+j);// converting 2-D grind into 1-D
                    
                    for(int k=0;k<4;k++){
                        int new_x=i+dir[k][0];
                        int new_y=j+dir[k][1];
                        if(new_x>=0 && new_y>=0 && new_x<rows && new_y<cols && grid[new_x][new_y]==1){
                        int p2=obj.find(new_x*cols+new_y);
                        
                        if(p1!=p2){
                            obj.union(p1,p2);
                            noOfSets--;
                        }
                       
                        }
                    }
                        
                   max=Math.max(max,obj.getSize(p1));    
                }
            }
        }
        
       return max; 
    }
}

class UnionFind {
    int root[];
    int size[];
    
    UnionFind(int V){
        root=new int[V];
        size=new int[V];
        
        for(int i=0;i<V;i++){
            root[i]=i;
            size[i]=1;
        }
    }
    
    int getSize(int x){
        return size[x];
    }
    
    void union(int x,int y){
        root[y]=x;
        size[x]+=size[y];
    }
    
    int find(int x){
        if(x==root[x]){
            return x;
        }
        
        return x=find(root[x]);
    }
}