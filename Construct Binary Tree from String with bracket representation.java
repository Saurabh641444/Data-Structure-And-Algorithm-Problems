//{ Driver Code Starts
import java.io.*;
import java.util.*;


class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    
    public static Node buildTree(String str)
    {
        // Corner Case
        if(str.length()==0 || str.charAt(0)=='N')
            return null;
        
        // Creating array of Strings from input 
        // String after spliting by space
        String ip[] = str.split(" ");
        
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        
        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        
        // Starting from the second element
        int i = 1;
        while(queue.size()>0 && i < ip.length)
        {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static Node inputTree(BufferedReader br) throws IOException
    {
        return buildTree(br.readLine().trim());
    }
    
    public static void inorder(Node root)
    {
        if (root == null)
           return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            Node res = obj.treeFromString(s);
            
            Node.inorder(res);
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static Node treeFromString(String s) {
        // code here
        return solve(s,0,s.length()-1);
    }
    
    private static Node solve(String str,int start,int end){
        
        if(start>end){
            return null;
        }
        
        String num="";
        
        while(start<str.length() && str.charAt(start)>='0' && str.charAt(start)<='9'){
            num+=str.charAt(start);
            start++;
        }
        
        Node root=new Node(Integer.parseInt(num));
        
        int index=-1;
        
        if(start<=end && str.charAt(start)=='('){
            index=balancePair(str,start,end);
        }
        
        if(index!=-1){
            root.left=solve(str,start+1,index-1);
            root.right=solve(str,index+2,end-1);
        }
        
        return root;
    }
    
    private static int balancePair(String str,int start,int end){
        
        if(start>end){
            return -1;
        }
        
        Stack<Character> st=new Stack<>();
        
        for(int i=start;i<=end;i++){
            char ch=str.charAt(i);
            
            if(ch=='('){
                st.push(ch);
            }
            
            if(ch==')'){
                if(st.peek()=='('){
                    st.pop();
                }
                
                if(st.isEmpty()) return i;
            }
        }
        
        return -1;
    }
}
        
