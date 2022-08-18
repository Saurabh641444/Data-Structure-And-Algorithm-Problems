import java.io.*;
import java.util.*;
import java.util.LinkedList;

class Graph {
    
      
    private int V;
    private LinkedList<Integer> adj[];
    
    Graph(int v){
        V=v;
        
        adj=new LinkedList[v];
        
        for(int i=0;i<v;i++){
            adj[i]=new LinkedList();
        }
    }

   void addEdge(int u,int v){
       adj[u].add(v);
     }

   Graph getTranspose(){
     Graph g=new Graph(V);
     for(int v=0;v<V;v++){
            Iterator<Integer> i=adj[v].listIterator();
            while(i.hasNext()){
                g.adj[i.next()].add(v);
            }
      }
     return g;
   }



void helper(){
        Stack<Integer> st=new Stack<>();
        
        boolean visited[]=new boolean[V];
        
        for(int i=0;i<V;i++){
        if(!visited[i]){
                dfs(i,visited,st);
                  }
              }

       Graph gr=getTranspose();
       Arrays.fill(visited,false);
       System.out.println();
       while(st.size()>0){
            int v=st.pop();

           if(visited[v]==false){
             gr.DFSUtil(v,visited);
             System.out.println();
              }
        }

    }

void DFSUtil(int s,boolean [] vis){
     
   vis[s]=true;
   System.out.print(s+" "); 
   Iterator<Integer> i=adj[s].iterator();
   while(i.hasNext()){
       int n=i.next();
       if(!vis[n]){ DFSUtil(n,vis);}
         }
    
  

 }

 void dfs(int s,boolean [] vis,Stack<Integer> st){
     
   vis[s]=true;
   
   Iterator<Integer> i=adj[s].iterator();
   while(i.hasNext()){
       int n=i.next();
       if(!vis[n]){ dfs(n,vis,st);}
         }
    
  st.push(s);

 }
}
class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
         Graph g=new Graph(5);
       g.addEdge(0,2);
       g.addEdge(2,1);
       g.addEdge(1,0);
       g.addEdge(2,3);
       g.addEdge(3,4);
       g.addEdge(4,3);
       
       g.helper();
    }
}
