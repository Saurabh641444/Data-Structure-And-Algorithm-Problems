import java.util.*;
import java.io.*;
public class PrintNarrayTree {
	
	static class Node{
		int data;
		ArrayList<Node> child= new ArrayList<>();
		
	}
	
	
	private static void display(Node node) {
		if(node==null) {
			return;
		}
		
		String str=node.data+"-->";
		
		for(Node c:node.child) {
			str+=c.data+",";
		}
		str+=".";
		System.out.println(str);
		
		for(Node c:node.child) {
			display(c);
		}
		
	}
     private static int count=0;
	private static void getSize(Node node) {
		
		if(node==null) {
			
			return;
		}
		
		count++;
		for(Node c:node.child) {
			getSize(c);
		}
		
		
	}
	
	 private static int max=Integer.MIN_VALUE;
	 
		private static void maxVal(Node node) {
			
			if(node==null) {
				
				return;
			}
			
			max=Math.max(max, node.data);
			for(Node c:node.child) {
				maxVal(c);
			}
			
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {10,20,50,-1,60,-1,-1,30,700,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = null;
        Stack<Node> st=new Stack<>();
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==-1) {
        		if(st.size()>0) {
        			st.pop();
        		}
        	}else {
        		Node t=new Node();
        		t.data=arr[i];
        		
        		if(st.size()>0) {
        		st.peek().child.add(t);
        		
        		}else { 
        			root=t;
        		}
        		
        		st.push(t);
        	}
        }
        
        display(root);
        getSize(root);
        System.out.println( "\n"+count);
        maxVal(root);
        System.out.println( "\n"+max);
	}

}
