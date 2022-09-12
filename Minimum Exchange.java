//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            char[][] matrix = new char[n][m];
            for(int i = 0; i < n; i++){
                String S = br.readLine().trim();
                for(int j = 0; j < m; j++){
                    matrix[i][j] = S.charAt(j);
                }
            }
            Solution obj = new Solution();
            int ans = obj.MinimumExchange(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int MinimumExchange(char[][] matrix)
    {
        // Code here
        int m=matrix.length;
        int n=matrix[0].length;
        
        int seq1=0,seq2=0;
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                if(matrix[i][j]=='A'){
                    
                    if((i+j)%2==1){
                        seq1++;
                    }else{
                        seq2++;
                    }
                    
                }else{
                    if((i+j)%2==1){
                        seq2++;
                    }else{
                        seq1++;
                    }
                }
            }
            
            
            
        }
        
        
        int ans=Math.min(seq1,seq2);
        
        if(ans%2==0) return ans/2;
        else return Math.min(ans,(m*n-ans)/2);
    }
}
