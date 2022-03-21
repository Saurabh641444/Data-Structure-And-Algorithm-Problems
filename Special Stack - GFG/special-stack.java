// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
   Stack<Integer> ss=new Stack<>();
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	    
	    if(ss.size()==0||ss.peek()>=a){
	        ss.push(a);
	    }
	    return;
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(s.size()==0) return -1;
            int ans=s.peek();
            s.pop();
            
            if(ss.peek()==ans){
                ss.pop();
            }
            return ans;
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           if(ss.size()==0) return -1;
           return ss.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
            return s.size()==n;
           
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.size()==0;
	}
}