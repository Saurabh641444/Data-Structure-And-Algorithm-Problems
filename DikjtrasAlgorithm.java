package Graph;
import java.util.*;
import java.io.*;

public class DikstrasAlgorithm {
     
   static class Graph{
    	ArrayList<ArrayList<ArrayList<Integer>>> graph;
    	int V;
    	
    	Graph(int V){
    		this.V=V;
    		
    		graph=new ArrayList<ArrayList<ArrayList<Integer>>>();
    		
    		for(int i=0;i<V;i++){
    			graph.add(new ArrayList<ArrayList<Integer>>());
    		}
    	 		
    	}
    	
    	void addEdge(int u,int v,int w){
    		ArrayList<Integer> t1=new ArrayList<Integer>();
    		ArrayList<Integer> t2=new ArrayList<Integer>();
    		
    		t1.add(u);
    		t1.add(w);
    		t2.add(v);
    		t2.add(w);
    		
    		graph.get(u).add(t2);
    		graph.get(v).add(t1);
    		
    	}
    	
    }	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int T=Integer.parseInt(br.readLine().trim());
       
       while(T-->0){
    	   int V=Integer.parseInt(br.readLine().trim());
    	   
    	   Graph obj=new Graph(V);
    	   
    	   int E=Integer.parseInt(br.readLine().trim());
    	   
    	   int i=0;
    	
    	   while(i++<E){
    		   String ip[]=br.readLine().trim().split(" ");
    		   int u=Integer.parseInt(ip[0]);
    		   int v=Integer.parseInt(ip[1]);
    		   int w=Integer.parseInt(ip[2]);
    		   obj.addEdge(u, v, w);
    	   }
    	   
    	   int path[]=new Solution().algo(obj.graph,V,1);
    	   
    	   for(int j=0;j<V;j++){
    		   System.out.print(path[j]+" ");
    	   }
    	   
       }
		
	}
	
	static class Solution{
		
		public static int[] algo(ArrayList<ArrayList<ArrayList<Integer>>> graph,int V,int source){
		   int path[]=new int[V];
		   
		   Arrays.fill(path, Integer.MAX_VALUE);
		   
		   PriorityQueue<int []> pq=new PriorityQueue<>((int a[],int b[])->a[2]-b[2]);
		   
		   pq.add(new int[]{source,0,0});
		   path[source]=0;
		   while(pq.size()>0){
			   
			   int temp[]=pq.poll();
			   int curr_source=temp[0];
			   
			   System.out.println(curr_source+" "+graph.get(curr_source).size());
			   for(int i=0;i<graph.get(curr_source).size();i++){
				   
				   int curr_destination=graph.get(curr_source).get(i).get(0);
				   int curr_weight=graph.get(curr_source).get(i).get(1);
				   
				   if(curr_weight+path[curr_source]<path[curr_destination]){
					   path[curr_destination]= curr_weight+path[curr_source];
					   
					   pq.add(new int[]{curr_destination,curr_source,path[curr_destination]});
				   }
			   }
			   
		   }
		   
		   
		   return path;
		}
		
	}

}
