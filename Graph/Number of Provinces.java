class Solution {
    public int findCircleNum(int[][] adj_mat) {
        int v=adj_mat.length;
       boolean visited[]=new boolean[v];
       int count=0;
        for(int i=0; i<v;i++){
         if(visited[i]==false){
                  count++;
                 printHelper(adj_mat,i,visited);
             
              }
        }
        return count;
    }
      public static void printHelper(int adj_mat[][],int sv,boolean visited[]){
   
       System.out.println(sv);
       visited[sv]=true;
       int v=adj_mat.length;
       for(int i=0;i<v;i++){
          if(adj_mat[sv][i]==1 && visited[i]==false){
                 printHelper(adj_mat,i,visited);
          }
         }
      
     }
}
