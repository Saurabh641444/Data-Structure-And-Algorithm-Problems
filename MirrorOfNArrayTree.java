import java.util.*;
import java.io.*;
public class PrintNarrayTree {
	
	static class Node{
		int data;
		ArrayList<Node> child= new ArrayList<>();
		
		Node(){}
		Node(int data){
			this.data=data;
		}
		
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
		
		 private static int height;
		 
			private static int getHeight(Node node) {
			 height=-1;
//				if(node==null) {
//					
//					return -1;
//				}
				
				
				
				for(Node c:node.child) {
				
					int ch=getHeight(c);
					height=Math.max(ch, height);
				}
				height+=1;
				return height;
			}
			
		private static void dfs(Node node) {
			if(node ==null) return;
			
			System.out.println("Node Pre "+node.data);
			for(Node c:node.child) {
				System.out.println("Edge Pre " +node.data+" "+c.data);
				dfs(c);
				System.out.println("Edge Post "+node.data+" "+c.data);
			}
			System.out.println("Node Post "+node.data);
		}
		
	
		private static void bfs(Node node) {
			if(node==null) {
				
				return;
			}
			 Queue<Node> q=new LinkedList<>();
			 
			q.offer(node);
			while(q.size()>0) {
				 node=q.remove();
				System.out.println(node.data+" ");
			   for(Node c:node.child) {
				q.offer(c);
			  }
			}
			System.out.println(" . ");
			
		}
		
		private static void bfsL(Node node) {
			if(node==null) {
				
				return;
			}
			 Queue<Node> q=new LinkedList<>();
			 Queue<Node> cq=new LinkedList<>();
			q.offer(node);
			while(q.size()>0 ) {
				 node=q.remove();
				System.out.print(node.data+"\t");
				
			   for(Node c:node.child) {
				cq.offer(c);
			  }
			   
			   if(q.isEmpty()) {
				    q=cq;
				    cq=new LinkedList<>();
					System.out.println();
				}
			  
			}
			System.out.println(" . ");
			
		}
		
		private static void bfsL2(Node node) {
		
			 Queue<Node> q=new LinkedList<>();
			 
			q.offer(node);
			q.offer(new Node(-1));
			while(q.size()>0 ) {
				 node=q.remove();
				 if(node.data!=-1) {
				System.out.print(node.data+"\t");
				
			   for(Node c:node.child) {
				q.offer(c);
			  }
			   
			   
			  
			}else {
				if(q.size()>0) {
				 q.offer(new Node(-1));
				 System.out.println();
			 }}
				 }
//			System.out.println(" . ");
			
		}
		
		private static void bfsL3(Node node) {
			
			 Queue<Node> q=new LinkedList<>();
			 
			q.offer(node);
			
			while(q.size()>0 ) {
				int cicl=q.size();
				
				for(int i=0;i<cicl;i++) {
					node=q.poll();
				System.out.print(node.data+"\t");
				
			   for(Node c:node.child) {
				q.offer(c);
			   }
				}
				System.out.println();
				 }

			
		}
		
	    private static class Pair{
            Node node;
             int level;
             Pair(Node node,int level){
                  this.node=node;
                  this.level=level;
                }
  }		
 private static void bfsL4(Node node) {
			
			 Queue<Pair> q=new LinkedList<>();
			 
			q.offer(new Pair(node,1));
			int level=1;
			while(q.size()>0 ) {
				Pair p=q.poll();
                if(p.level>level){
                level=p.level;
               System.out.println();
                }
                
             System.out.print(p.node.data+" ");
             for(Node c:p.node.child){
            Pair cp=new Pair(c,p.level+1);
            q.add(cp);
             }
				 }

			
		}
		
 
		private static void bfsZigZag(Node node) {
			if(node==null) {
				
				return;
			}
			Stack<Node> st1=new Stack<>();
			Stack<Node> st2=new Stack<>();
			int level=1;
			st1.push(node);
			while(st1.size()>0 ) {
				 node=st1.pop();
				System.out.print(node.data+"\t");
				
				if(level%2==1){
					for(int i=0;i<node.child.size();i++){
					 Node c=node.child.get(i);
					 st2.push(c);
					}
					}else{
					for(int i=node.child.size()-1;i>=0;i--){
					 Node c=node.child.get(i);
					 st2.push(c);
					}
					}
			   
			   if(st1.isEmpty()) {
				    st1=st2;
				    st2=new Stack<>();
				    level++;
					System.out.println();
				}
			  
			}
			System.out.println(" . ");
			
		}
		
	private static void mirror(Node node) {
		
		for(Node cc:node.child) mirror(cc);
		Collections.reverse(node.child);
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
//        getSize(root);
//        System.out.println( "\n"+count);
//        maxVal(root);
//        System.out.println( "\n"+max);
        
       
//        System.out.println( "\n"+getHeight(root));
//        dfs(root);
//        bfs(root);
        mirror(root);
        bfsL4(root);
//        bfsZigZag(root);
        
       
	}

}
