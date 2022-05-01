// { Driver Code Starts
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
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution
{
    public class Pairs   {
        int st;
        int et;
        
        Pairs(int st,int et){
            this.st=st;
            this.et=et;
        }
        
        // this> other return +ve
        // this=other return 0
        // this< other return -ve
   
    }
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        Pairs[] pairs=new Pairs[Intervals.length];
        Arrays.sort(Intervals, (a,b) -> {
            if(a[0] == b[0])
                return b[0];
            return a[0]-b[0];
        });
        
        for(int i=0;i<Intervals.length;i++){
            pairs[i]=new Pairs(Intervals[i][0],Intervals[i][1]);
        }
        
        
        
        
        Stack<Pairs> st=new Stack<>();

    for(int i=0;i<pairs.length;i++){
        if(i==0){
         st.push(pairs[i]);
        }else{
          Pairs top=st.peek();
       
    	if(pairs[i].st>top.et){

               st.push(pairs[i]);
                     }
                     else if(top.et>=pairs[i].st){
                      top.et=Math.max(top.et,pairs[i].et);
                      top.st=Math.min(top.st,pairs[i].st);}
                   
      }
}

        Stack<Pairs> rs=new Stack<>();
            while(!st.isEmpty()){
                    rs.push(st.pop());
                }
             int res[][]=new int[rs.size()][2];
             int i=0;
                while(!rs.isEmpty()){
                    Pairs p=rs.pop();
                        //p.st,p.et
                       res[i][0] =p.st;
                       res[i][1]=p.et;
                       i++;
                            }
                            
                            return res;
    }
}