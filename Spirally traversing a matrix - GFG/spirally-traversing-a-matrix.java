// { Driver Code Starts
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
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        
        int a=0;
        
        int b=0;
        while(a<r&&b<c){
            for(i=b;i<c;i++){
                ans.add(matrix[a][i]);
            }
            a++;
            for(i=a;i<r;i++){
                ans.add(matrix[i][c-1]);
            }
            c--;
            if(a<r){
            for(i=c-1;i>=b;i--){
                ans.add(matrix[r-1][i]);
            }
                r--;
            }
             if(b<c){
            for(i=r-1;i>=a;i--){
                ans.add(matrix[i][b]);
            }
                b++;
            }
            
        }
        
        return ans;
    }
}
