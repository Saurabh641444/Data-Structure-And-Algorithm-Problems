// { Driver Code Starts
import java.util.Scanner;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
class GFG1 {
    public static void printList(Node head)
    {
        Node start=head;
        System.out.print(head.data+" ");
        head=head.next;
        while(head!=start)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        Node start=null,cur=null;
	        for(int i=0;i<n;i++)
	        {
	            int a=sc.nextInt();
	            Node ptr=new Node(a);
	            if(start==null)
	            {
	                start=ptr;
	                cur=ptr;
	            }
	            else
	            {
	                cur.next=ptr;
	                cur=ptr;
	            }
	        }
	        int delNode=sc.nextInt();
	        cur.next=start;
	        GFG obj=new GFG();
	        Node head=obj.deleteNode(start,delNode);
	        start=obj.reverse(head);
	        printList(start);
	    }
	}
}// } Driver Code Ends


/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/

class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        //Add your code here.
        Node flag=head;
        Node prev=head;
        head=head.next;
        
        while(flag!=head){
            if(head.data==d){
                prev.next=head.next;
            }
            prev=head;
            head=head.next;
        }
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        //Add your code here
        Node curr=head,prev=null;
        do{
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }while(curr!=head);
        head.next = prev;
        return prev;
    }
}