// { Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}


// } Driver Code Ends


class GfG
{
    int min=Integer.MAX_VALUE;
    Stack<Integer> st=new Stack<>();
    boolean k=false;

    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	
	if(st.isEmpty()){ return -1;}
	if(k){
	    for(int v:st){
	        min=Math.min(min,v);
	    }
	    return min;
	}
	
	return min;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	
	if(st.isEmpty()){ return -1;}
	if(st.peek()==min){
	    k=true;
	    min=Integer.MAX_VALUE;
	}
	int t=st.pop();
	return t;
	
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	st.push(x);
	min=Math.min(min,x);
    }	
}

