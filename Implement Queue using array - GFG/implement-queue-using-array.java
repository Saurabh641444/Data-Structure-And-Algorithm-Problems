// { Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}



// } Driver Code Ends




class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
	int size=0;

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    if(size==arr.length){
	        System.out.println("Queue Overflow");
	    }else{
	        int rear=(front+size)%arr.length;
	        arr[rear]=x;
	        size++;
	    }
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(size==0){
		  //  System.out.println("Queue underflow");
		    return -1;
		    
		}else{
		    int val=arr[front];
		    front=(front+1)%arr.length;
		    size--;
		    return val;
		}
	} 
}




