class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(); 
        
        for(int i=0;i<numCourses;i++){
           adj.add(i,new ArrayList<>());    
        }
        
        for(int arr[]:prerequisites){
            adj.get(arr[0]).add(arr[1]);
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        int vis[]=new int[numCourses];
        
        Arrays.fill(vis,-1);
        
        for(int i=0;i<numCourses;i++){
           if(vis[i]==-1){
               if(dfs(adj,i,vis,res)==false) return new int[0];
           } 
        }
        
        int ans[]=new int[res.size()];
        
        for(int i=0;i<ans.length;i++){
            ans[i]=res.get(i);
        }
        
        return ans;
        
    }
    
    private boolean dfs(ArrayList<ArrayList<Integer>> adj,int s,int [] vis,ArrayList<Integer> res){
        
        vis[s]=0;
        
        for(Integer v:adj.get(s)){
            if(vis[v]==0) return false;
            
            if(vis[v]==-1){
                if(!dfs(adj,v,vis,res)){
                    return false;
                }
            }
        }
        
        vis[s]=1;
        res.add(s);
        return true;
    }
    
}