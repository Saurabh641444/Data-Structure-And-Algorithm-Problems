class Solution {
    public boolean isBipartite(int[][] graph) {
        
//0 red 1 red 2 blue
     
       int[] visited=new int[graph.length];
     
      for(int i=0;i<graph.length;i++){
               if(graph.length!=0 && visited[i]==0){
                   visited[i]=1;
                   Queue<Integer> q=new LinkedList<>();
                    q.offer(i);
           
                     while(!q.isEmpty()){
                              int current=q.poll();
                              
                              for(int c : graph[current]){
                                   
                                if(visited[c]==0){
                                visited[c]=(visited[current]==1) ? 2:1;
                                 q.offer(c);
                                        }
                                  else{
                       if(visited[c]==visited[current]){return false;}
                                   }

                              }                              

                       }                    

              }
     
      }
        return true;
    }
}
