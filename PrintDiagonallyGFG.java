//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.downwardDigonal(n, matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        for(int j=0;j<N;j++){
            int row=i;
            int col=j;
            
            while(row<=j && col>=0){
                ans.add(A[row][col]);
                row++;
                col--;
            }
            
            
        } 
        
        int j=N-1;
        
        for(i=1;i<N;i++){
            int row=i;
            int col=N-1;
            
            while(row<=j && col>=0){
                ans.add(A[row][col]);
                row++;
                col--;
            }
        }
        
        
        return ans;
    }
}
