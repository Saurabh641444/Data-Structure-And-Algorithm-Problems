class Solution {
    int [] parent;
    int [] minDist;
    
    private int findParent(int x){
        
       while(x!=parent[x]){
           int pa=parent[x];
            int ga=parent[pa];
            parent[x]=ga;
            x=pa; 
          }
        
        return x;
    }
    
    public int minScore(int n, int[][] roads) {
        parent=new int[n+1];
        minDist=new int[n+1];
        
        Arrays.fill(minDist,Integer.MAX_VALUE);
        
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
        
        for(int [] road:roads){
            int u=road[0];
            int v=road[1];
            int w=road[2];
            
            int parent_x=findParent(u);
            int parent_y=findParent(v);
            
            if(parent_x==parent_y){
                minDist[parent_x]=Math.min(w,minDist[parent_x]);
            }else{
                parent[parent_y]=parent_x;
                minDist[parent_x]=Math.min(minDist[parent_x],Math.min(w,minDist[parent_y]));
            }
        }
        
        int parent_n=findParent(n);
        return minDist[parent_n];
    
    }
    
   
}

