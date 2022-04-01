// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
}

class Partition {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.partition(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}// } Driver Code Ends


// User function Template for Java

/*class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node partition(Node node, int x) {
        // Your code here
        ArrayList<Integer> equal=new ArrayList<>();
        ArrayList<Integer> small=new ArrayList<>();
        ArrayList<Integer> large=new ArrayList<>();
        
        Node head=null;
        Node temp=null;
        
        while(node!=null){
            if(node.data==x){
                equal.add(node.data);
            }else if(node.data<x){
                small.add(node.data);
            }else if(node.data>x){
                large.add(node.data);
            }
            node=node.next;
        }
        
        for(int i=0;i<equal.size();i++){
            small.add(equal.get(i));
        }
        for(int i=0;i<large.size();i++){
            small.add(large.get(i));
        }
        
        head=new Node(small.get(0));
        temp=head;
        
        for(int i=1;i<small.size();i++){
            temp.next=new Node(small.get(i));
            temp=temp.next;
        }
        return head;
    }
}