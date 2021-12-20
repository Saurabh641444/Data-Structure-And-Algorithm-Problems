class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue=new LinkedList<Integer>();
         boolean[] visited=new boolean[rooms.size()];

          visited[0]=true;
           queue.add(0);
         
        while(!queue.isEmpty()){
                 int temp=queue.poll();
                 List<Integer> children=rooms.get(temp);
                 for(int j=0;j<children.size();j++){
                   int i=children.get(j);
                   if(visited[i]==false){
                        queue.add(i);
                         visited[i]=true;
                     }
            }
          }
         for(int i=0;i<visited.length;i++){

         if(visited[i]==false) return false;
          }
    return true;
    }
}
