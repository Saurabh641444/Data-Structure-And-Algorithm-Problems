int ans=0;
ArrayList<String> res=new ArrayList<>();
int time=0;

ArrayList<String> bridges(ArrayList<ArrayList<Integer>> adj,int V){

boolean vis[]=new boolean[V];
int parent[] =new int[V];
Arrays.fill(parent,-1);
int min[]=new int[V];
int arrival[]=new int[V];

for(int i=0;i<V;i++){
   if(!vis[i]){
     dfs(adj,i,vis,min,arrival,parent);
     }
}

return res;

}

void dfs(ArrayList<ArrayList<Integer>> adj,int u,boolean vis[],int min[],int [] arrival,int [] parent){

  vis[u]=true;
   min[u]=arrival[u]=time++;
   int child=0;

   for(Integer v:adj.get(u)){
       if(!vis[v]){
             parent[v]=u;
             child++;
             dfs(adj,v,vis,min,arrival,parent);

             arrival[u]=Math.min(arrival[u],arrival[v]);

             if(parent[u]!=-1 && min[u]<=arrival[v]){
                       res.add(""+u+"");
                  }
             }
        else if(v!=parent[u]){
             arrival[u]=Math.min(arrival[u],min[v]);
             }
      }

    if(parent[u]==-1 && child>1)  res.add(""+u+"");

}
