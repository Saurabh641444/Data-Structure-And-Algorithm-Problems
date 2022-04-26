class Solution {
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int[] > pq=new PriorityQueue<int[]>((a,b)->a[1]-b[1]);
        int n=points.length;
        for(int i=1;i<n;i++){
          int total=getDistance(points[0],points[i]); 
          pq.add(new int[]{i,total});
          }
         
        int len=n-1;
        boolean[] visited=new boolean[n];
        visited[0]=true;
         int cost=0;

        while(!pq.isEmpty() && len>0){
               int curr[]=pq.poll();
               int i=curr[0];
               if(visited[i]==false){ 
                     visited[i]=true;
                     len--;
                     cost+=curr[1];

               for(int j=0;j<n;j++){
                     if(i==j || visited[j]==true) continue;
                     int t=getDistance(points[i],points[j]);
                     pq.add(new int[]{j,t});
                       }
                 }
           }
           return cost;
    }

    public int getDistance(int[] a1,int [] a2){

       return Math.abs(a1[0]-a2[0])+Math.abs(a1[1]-a2[1]);
     }
}