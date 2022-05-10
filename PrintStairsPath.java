import java.io.*;
import java.util.*;
public class PrintStairsPath {
      
	private static ArrayList<String> ans=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       
       
       
       ans=getpath(n );
       for(int i=0;i<ans.size();i++) {
    	   System.out.println(ans.get(i));
       }
	}
	
	private static ArrayList<String> getpath(int n){
		
		if(n==0) {
			ArrayList<String> bres=new ArrayList<>();
			bres.add("");
			return bres;
		}else if (n<0) {
			ArrayList<String> bres=new ArrayList<>();
			
			return bres;
		}
		
		ArrayList<String> path1=getpath(n-1);
		ArrayList<String> path2=getpath(n-2);
		ArrayList<String> path3=getpath(n-3);
		ArrayList<String> paths=new ArrayList<>();
		for(String path:path1) {
			paths.add(1+path);
		}
		
		for(String path:path2) {
			paths.add(2+path);
		}
		
		for(String path:path1) {
			paths.add(3+path);
		}
		
		return paths;
	}

}
