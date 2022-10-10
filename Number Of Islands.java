class Solution {
    
    public List<Integer> numOfIslands(int rows, int cols, int[][] operators) {
        //Your code here
        List<Integer> ans=new ArrayList<>();
        
        int grid[][]=new int[rows][cols];
      
       int V=rows*cols;
       
       UnionFind obj=new UnionFind(V,rows,cols);
       
       int x[]={0,1, 0,-1};
       int y[]={1,0,-1, 0};
       
        for(int k=0;k<operators.length;k++){
            int r=operators[k][0];
            int c=operators[k][1];
            
            grid[r][c]=1;
            
     
                for(int d=0;d<4;d++){
                    int new_x=r+x[d];
                    int new_y=c+y[d];
                    
                    if(new_x>=0 && new_y>=0 && new_x<rows && new_y<cols && grid[new_x][new_y]==1){
                        obj.union(r*cols+c,new_x*cols+new_y);
                        // System.out.println("Euu");
                    }
                }
            
            
            
            ans.add(obj.getCount(grid));
        }
        
        return ans;
    }
    
   

}

class UnionFind{
    
    private int count;
    private int[] root;
    private int[] rank;
    private int m;
    private int n;
    
    UnionFind(int V,int m,int n){
        
        root=new int[V];
        rank=new int[V];
        this.m=m;
        this.n=n;
        
        for(int i=0;i<V;i++){
            root[i]=i;
            rank[i]=1;
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
        //  root[rootY]=rootX;
      if(rootX!=rootY){
            
            if(rank[rootX]>rank[rootY]){
                root[rootY]=rootX;
            }else if(rank[rootX]<rank[rootY]){
                root[rootX]=rootY;
            }else{
                root[rootY]=rootX;
                rank[rootX]++;
            }

           
        }
        
    }
    
    int getCount(int [][] grid){
     count=0;
     
     
     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             if(grid[i][j]==1 && root[i*n+j]==i*n+j){
                 count++;
                //  System.out.println("Euu");
             }
         }
     }
     
    //  System.out.println(count);
     return count;
    }
    
}
