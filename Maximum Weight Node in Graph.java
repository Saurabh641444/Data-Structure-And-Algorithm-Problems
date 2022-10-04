package Graph;
import java.util.*;
import java.io.*;

public class MaximumWeightNodeJuspayOA {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine().trim());
		
		int [] edges=new int[n];
		
		String ip[]=br.readLine().trim().split(" ");
		
		for(int i=0;i<n;i++){
			edges[i]=Integer.parseInt(ip[i]);
		}
		
		int ans=Integer.MIN_VALUE;
		int result=-1;
		
		int weight[]=new int[n];
		
		for(int i=0;i<n;i++){
			int source=i;
			int dest=edges[i];
			
			if(dest!=-1){
				weight[dest]+=source;
				
				if(ans<=weight[dest]){
					ans=Math.max(ans, weight[dest]);
					result=dest;
				}
			}
			
		}
		
		if(ans!=Integer.MIN_VALUE){
			System.out.println(result);
		}else{
			System.out.println(-1);
		}
		
	}

}
