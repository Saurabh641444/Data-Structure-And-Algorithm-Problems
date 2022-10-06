package Graph;
import java.io.*;
import java.util.*;

class UnionFind{
	int root[];
	
	UnionFind(int V){
		root=new int[V];	
		for(int i=0;i<V;i++){
			root[i]=i;
		}
	}
	
	int find(int x){
		return root[x];
	}
	
	void union(int x,int y){
		int rootX=find(x);
		int rootY=find(y);
		
		if(rootX!=rootY){
			for(int i=0;i<root.length;i++){
				if(root[i]==rootY){
					root[i]=rootX;
				}
			}
		}
	}
	
	boolean connected(int x,int y){
		return root[x]==root[y];
	}
}

public class DisjointSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       UnionFind obj=new UnionFind(9);
       
       obj.union(0, 1);
       obj.union(0, 2);
       obj.union(2, 3);
       obj.union(6, 7);
       obj.union(7, 6);
       obj.union(8, 7);
       
       System.out.println(obj.connected(0,3));
       System.out.println(obj.connected(0,8));
	}

}
