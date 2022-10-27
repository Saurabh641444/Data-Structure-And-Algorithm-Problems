//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            Solution ob = new Solution();
            int[] ans = ob.leafNodes(arr, N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    ArrayList<Integer> leaves=new ArrayList<>();
    
    public int[] leafNodes(int arr[], int N)
    {
        // code here
       /*
            4
        
       2         6
     
     1   3    5    7
     
     4 2 1 3 6 5 7
     
     0           6
       */
       
       int l=0,r=N-1;
       
       solve(l,r,arr);
       
       return leaves.stream().mapToInt(i->i).toArray();
        
    }
    
    public void solve(int l,int r, int arr[]){
        if(l>r){
            return;
        }    
        
        if(l==r){
            leaves.add(arr[l]);
            return;
        }
        
        int i;
        
        for(i=l+1;i<=r;i++){
            if(arr[i]>arr[l]) break;
        }
        
        solve(l+1,i-1,arr);
        solve(i,r,arr);
    }
    
}
