package Graph;

import java.util.Arrays;
import java.util.*;
import java.io.*;
public class AdjacencyMatrixRepresentation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int T=Integer.parseInt(br.readLine().trim());
      
      while(T-->0) {
          String ip[]=br.readLine().trim().split(" ");
    	  Matrix obj=new Matrix(Integer.parseInt(ip[0]));
    	  int n=Integer.parseInt(ip[0]);
    	  int m=Integer.parseInt(ip[1]);
    	  while(m-->0) {
    		  String ip1[]=br.readLine().trim().split(" ");  
    		  int u=Integer.parseInt(ip1[0]);
    		  int v=Integer.parseInt(ip1[1]);
    		  obj.fillMatrix(u, v);
    	  }
    	  
    	  obj.printMatrix(Integer.parseInt(ip[0]));
    	  
      }
	}

}

class Matrix{
	int matrix[][];
	int u, v;
	public Matrix(int n) {
		matrix=new int[n+1][n+1];
		
		for(int[] row:matrix) {
			Arrays.fill(row, 0);
		}
	}
	
	public void printMatrix(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print(" "+matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	void fillMatrix(int u,int v) {
		matrix[u][v]=1;
		matrix[v][u]=1;
	}
}
