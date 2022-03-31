// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class LinkedList
{
    static  Node head;  
    static  Node lastNode;
    
    public static void addToTheLast(Node node)
    {

        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n, K;
            n = sc.nextInt();
            K = sc.nextInt();
            
            Node head = null;
            int val = sc.nextInt();
            head = new Node(val);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                val = sc.nextInt();
                addToTheLast(new Node(val));
            }
            
            Node before[] = new Node[n];
            addressstore(before, head);
            GFG obj = new GFG();
            
            head = obj.swapkthnode(head, n, K);
        
           Node after[] = new Node[n];
          addressstore(after, head);
        
        if(check(before, after, n, K) == true)
            System.out.println("1");
        else
            System.out.println("0");
        
        }
    }
    
    static boolean check(Node before[], Node after[], int num, int K)
    {
          if(K > num)
           return true;
           
           return (before[K-1] == after[num - K]) && (before[num-K] == after[K-1]);
              
       
    }
    
    static void addressstore(Node arr[], Node head)
  {
      Node temp = head;
      int i = 0;
      while(temp != null){
        arr[i] = temp;
        i++;
        temp = temp.next;
    }
}
    
}// } Driver Code Ends


//User function Template for Java


/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class GFG
{
    //Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K)
    {
        // your code here
        if(K>num || 2*K-1==num){ return head;}
        
        if(K>num/2){ K=num-K+1;}
        Node temp1=head;
        Node temp2=head;
        Node prev_temp1=null;
        Node prev_temp2=null;
        Node next_temp1=null;
        Node next_temp2=null;

      int x=K;
      while(x>1){
          prev_temp1=temp1;
          temp1=temp1.next;
            x--;
            }
         x=K;
        while(num-x>0){
          prev_temp2=temp2;
          temp2=temp2.next;
            x++;
            }
         next_temp1=temp1.next;
         next_temp2=temp2.next;
         if(temp2.next==null){
              temp2.next=next_temp1;
              prev_temp2.next=temp1;
              temp1.next=null;
              return temp2;
             }else if(temp1.next==temp2){
                    prev_temp1.next=temp2;
                    temp2.next=temp1;
                    temp1.next=next_temp2;
             }else{
                 prev_temp1.next=temp2;
                 temp2.next=next_temp1;
                  prev_temp2.next=temp1;
                 temp1.next=next_temp2;
                }

      return head;
    }
}

