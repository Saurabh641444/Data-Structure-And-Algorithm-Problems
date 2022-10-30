class Solution {
    private static final int[][] DIRECTIONS={{0,1},{1,0},{0,-1},{-1,0}};
    public int shortestPath(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
      
        int [][][] dist=new int[m][n][k+1];
        
        for(int [][] A:dist){
            for(int[] B:A){
                Arrays.fill(B,Integer.MAX_VALUE);
            }
        }
        
        Arrays.fill(dist[0][0],0);
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[3]-b[3]));
        
        pq.add(new int[]{0,0,0,0});
        
        while(!pq.isEmpty()){
            int size=pq.size();
            
           
                int[] curr=pq.poll();
                
                if(curr[0]==m-1 && curr[1]==n-1) continue;
                
                for(int[] dir:DIRECTIONS){
                    int newX=curr[0]+dir[0];
                    int newY=curr[1]+dir[1];
                    
                    /* out of bound condition*/
                    if(newX>=m || newY>=n || newX<0 ||newY<0  ) continue;
                    
                    // continue if we can't move due to k
                    
                    int newK=curr[2]+grid[newX][newY];
                    
                    if(newK>k) continue;
                    
                    int newDist=curr[3]+1;
                    
                    if(newDist>=dist[newX][newY][newK]) continue;
                    
                    dist[newX][newY][newK]=newDist;
                    pq.add(new int[]{newX,newY,newK,newDist});
                    
                }
            
        }
        
        int res=dist[m-1][n-1][0];
        
        for(int i=1;i<=k;i++){
            res=Math.min(res,dist[m-1][n-1][i]);
        }
        
        if(res==Integer.MAX_VALUE) return -1;
        
        return res;
        
    }
}