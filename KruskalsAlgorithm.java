package Graph;
import java.util.*;
import java.io.*;

public class KruskalsAlgorithm {

	static class Node{
		private int u;
		private int v;
		private int w;
		
		Node(int u,int v,int w){
		   this.u=u;
		   this.v=v;
		   this.w=w;
		}
		
		int getWeight(){
			return w;
		}
		
		int getU(){
			return u;
		}
		
		int getV(){
			return v;
		}
		
	} 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int T=Integer.parseInt(br.readLine().trim());
	   
       while(T-->0){
    	   int V=5;
    	   ArrayList<Node> adj=new ArrayList<>();
    		
   		adj.add(new Node(0, 1, 2));
   		adj.add(new Node(0, 3, 6));
   		adj.add(new Node(1, 3, 8));
   		adj.add(new Node(1, 2, 3));
   		adj.add(new Node(1, 4, 5));
   		adj.add(new Node(2, 4, 7));

    	new Solution().AlgorithmImplementation(adj,V);
    	
       }
       
	}
	
	static class SortComparator implements Comparator<Node>{

		@Override
		public int compare(Node a, Node b) {
			
			
			if(a.getWeight()<b.getWeight()){
				return -1;
			}else if(a.getWeight()>b.getV()){
				return 1;
			}
			
			return 0;
		}
		
	}
	
	static class Solution{
		
		public static ArrayList<Node> AlgorithmImplementation(
				ArrayList<Node> adj,int V)
		{
			ArrayList<Node> ans=new ArrayList<>();
			
			Collections.sort(adj,new SortComparator());
			
			UnionFind obj3=new UnionFind(V);
			
			int distance=0;
			
			for(Node it:adj){
				if(obj3.find(it.getU())!=obj3.find(it.getV())){
					distance+=it.getWeight();
					ans.add(it);
					obj3.union(it.getU(),it.getV());
				}
			}
			System.out.print(distance);
			return ans;
		}
	}
	
	static class UnionFind{
		
		int root[];
		int rank[];
		
		UnionFind(int V){
			root=new int[V];
			rank=new int[V];
			
			for(int i=0;i<V;i++){
				root[i]=i;
				rank[i]=1;
			}
		}
		
		void union(int x,int y){
			int rootX=find(x);
			int rootY=find(y);
			
			if(rootX!=rootY){
				
				if(rank[rootX]>rank[rootY]){
					root[rootY]=rootX;
				}else if(rank[rootX]<rank[rootY]){
					root[rootX]=rootY;
				}else{
					root[rootY]=rootX;
					rank[rootX]++;
				}
			}
		}
		
		int find(int x){
			if(x==root[x]) return x;
			
			return x=find(root[x]);
		}
		
	}

}
