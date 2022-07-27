package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AdjacencyListRepresentation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      int T=Integer.parseInt(br.readLine().trim());
	      
	      while(T-->0) {
	          String ip[]=br.readLine().trim().split(" ");
	          AdjacencyList obj=new AdjacencyList(Integer.parseInt(ip[0]));
	    	  int n=Integer.parseInt(ip[0]);
	    	  int m=Integer.parseInt(ip[1]);
	    	  while(m-->0) {
	    		  String ip1[]=br.readLine().trim().split(" ");  
	    		  int u=Integer.parseInt(ip1[0]);
	    		  int v=Integer.parseInt(ip1[1]);
	    		  obj.fillAdjacencyList(u, v);
	    	  }
	    	  
	    	  obj.printAdjacencyList();
	    	  
	      }
	}

}

class AdjacencyList{
	ArrayList<ArrayList<Integer>> list;
	
	public AdjacencyList(int n) {
		list=new ArrayList<ArrayList<Integer>> ();
		for(int i=0;i<n+1;i++) {
		list.add(new ArrayList<>());	
		}
	}
	
	
	void fillAdjacencyList(int u,int v) {
		list.get(u).add(v);
		list.get(v).add(u);
	}
	
	void printAdjacencyList() {
		for(int i=0;i<list.size();i++) {
			System.out.print(" "+ i + " ");
			for(int j=0;j<list.get(i).size();j++) {
				System.out.print(" "+list.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
}
