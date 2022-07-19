package Non_LinearDS;
import java.util.*;
import java.io.*;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=right=null;
		}
}
public class PrintRootToNodePathBinaryTree {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int T=Integer.parseInt(br.readLine().trim());
         
         while(T-->0) {
        	 String ip=br.readLine().trim();
        	 Node root=BuildTree(ip);
        	 
        	 int B=Integer.parseInt(br.readLine().trim());
        	 ArrayList<Integer> res=getPath(root,B);
        	 
        	 System.out.println(res);
         }
	}
	
	private static ArrayList<Integer> getPath(Node root,int B){
		ArrayList<Integer> ans=new ArrayList<>();
		if(root==null) return ans;
		dfs(root,B,ans);
		return ans;
		
	}
	
	private static boolean dfs(Node node,int B,ArrayList<Integer> ans) {
		if(node==null) return false;
		ans.add(node.data);
		if(node.data==B) { return true;}
		
		if(dfs(node.left,B,ans)||dfs(node.right,B,ans)) return true;
		ans.remove(ans.size()-1);
		return false;
	}
	
	private static Node BuildTree(String str) {
		if(str.length()==0 || str.charAt(0)=='N') {
			return null;
		}
		
		String ip[]=str.split(" ");
		
		Node root=new Node(Integer.parseInt(ip[0]));
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		int i=1;
		
		while(q.size()!=0 && i<ip.length) {
		   Node curr=q.poll();
		   
		   String currVal=ip[i];
		   
		   if(ip[i].equals("N")==false) {
			   curr.left=new Node(Integer.parseInt(ip[i]));
			   q.add(curr.left);
		   }
		   i++;
		   if(i>=ip.length) break;
         String currVal1=ip[i];
		   
		   if(!currVal1.equals("N")) {
			   curr.right=new Node(Integer.parseInt(ip[i]));
			   q.add(curr.right);
		   }
		   i++;
		}
		
		
		
		return root;
		
	}

}
