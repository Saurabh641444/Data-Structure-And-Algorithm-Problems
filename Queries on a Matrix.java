//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int q = Integer.parseInt(s[1]);
            int[][] Queries = new int[q][4];
            for (int i = 0; i < q; i++) {
                String[] s1 = br.readLine().trim().split(" ");
                for (int j = 0; j < 4; j++)
                    Queries[i][j] = Integer.parseInt(s1[j]);
            }
            Solution obj = new Solution();
            int[][] ans = obj.solveQueries(n, Queries);
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[i].length; j++) {
                    out.print(ans[i][j] + " ");
                }
                out.println();
            }
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public int[][] solveQueries(int n, int[][] q) {

        // Code here

        int i,j;

        int arr[][]=new int[n+1][n+1];

        for(i=0;i<=n;++i){

            for(j=0;j<=n;++j)

                arr[i][j]=0;

        }

        for(i=0;i<q.length;++i){

                arr[q[i][0]][q[i][1]]+=1;

                arr[q[i][2]+1][q[i][3]+1]+=1;

                arr[q[i][2]+1][q[i][1]]-=1;

                arr[q[i][0]][q[i][3]+1]-=1;

        }

        //row

        for(i=0;i<=n;++i){

            for(j=1;j<=n;++j){

                arr[i][j]+=arr[i][j-1];

            }

        }

        //column

        for(i=0;i<=n;++i){

            for(j=1;j<=n;++j){

                arr[j][i]+=arr[j-1][i];

            }

        }

        int ans[][]=new int[n][n];

        for(i=0;i<n;++i){

            for(j=0;j<n;++j)

                ans[i][j]=arr[i][j];

        }

        return ans;

    }

}
