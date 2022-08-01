//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    public static class Pair implements Comparable<Pair> {
        int u;
        int v;
        int w;
        
        Pair(int _u,int _v,int _w ){
            this.u=_u;
            this.v=_v;
            this.w=_w;
        }
        
        public int compareTo(Pair o){
            return this.w-o.w;
        }
    }
    
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        Queue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(S,0,0));
        boolean vis[]=new boolean[V];
       
       int path[]=new int[V]; 
        while(pq.size()>0){
            Pair node =pq.poll();
            
            if(vis[node.u]==true){
            continue;
            }
                vis[node.u]=true;
                path[node.u]=node.w;
                
                for(ArrayList<Integer> e:adj.get(node.u)){
                    if(vis[e.get(0)]==false){
                        pq.add(new Pair(e.get(0),node.u,e.get(1)+node.w));
                    }
                }
                
            
        }
        
        return path;
    }
}

