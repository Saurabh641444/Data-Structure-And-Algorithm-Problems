// class Solution {
//     int longestCycle=-1;
//     public int longestCycle(int[] edges) {
        
//          int n=edges.length;
//         ArrayList<Integer> graph[]=new ArrayList[edges.length];
        
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Integer>();
//         }
        
//         for(int i=0;i<n;i++){
            
//             if(edges[i]!=-1){
//                 graph[i].add(edges[i]);  
//             }
//         }
        
//         boolean vis[]=new boolean[edges.length];
        
    
//         for(int i=0;i<n;i++){
           
//             if(vis[i]==false){
//                 HashMap<Integer,Integer> hm =new HashMap<>();
                
//                 dfs(graph,i,hm,0,vis);
//             }
//         }
        
        
//         return longestCycle;
//     }
    
//     private void dfs(ArrayList<Integer> graph[],int node, HashMap<Integer,Integer> hm,int path,boolean[] vis ){
      
//         if(vis[node]==true){
            
//             if(hm.get(node)!=null){
//                 longestCycle=Math.max(longestCycle,path-hm.get(node));
//             }
            
//             return;
//         }
        
//         vis[node]=true;
//         hm.put(node,path);
        
//         for(int i=0;i<graph[node].size();i++){
//             dfs(graph,graph[node].get(i),hm,path+1,vis);
//         }
        
//     }
    
// }

class Solution {
    public int longestCycle(int[] edges) {
        int longest = -1;
        boolean visited[] = new boolean[edges.length];  // global visisted
        HashMap<Integer, Integer> map;

        for(int i=0; i<edges.length; i++){
            if(visited[i]) continue;
            int distance = 0, curr_node = i;
            map = new HashMap<>();  // local visited
            while(curr_node != -1){
                if(map.containsKey(curr_node)){
                    longest = Math.max(longest, distance - map.get(curr_node));
                    break;
                }
                if(visited[curr_node]) break;
                visited[curr_node] = true;
                map.put(curr_node, distance);
                curr_node = edges[curr_node];
                distance++;
            }
            
        }
        return longest;
    }
}