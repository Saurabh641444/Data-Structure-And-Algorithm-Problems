//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        
        if(n==0) return 0;
        
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->a[1]==b[1]? a[0]-b[0]:a[1]-b[1]);
        
        for(int i=0;i<n;i++){
          pq.add(new int[]{start[i],end[i]});    
        }
        
        int temp1[]=pq.poll();
        
        // System.out.println(temp1[0]+" "+temp1[1]);
        
        int ans=1;
        
        
        int prev=temp1[1];
        
        while(!pq.isEmpty()){
            int temp[]=pq.poll();
              
            //   if(temp[0]==temp[1]) continue;
        
             if(temp[0]>prev){
                 ans++;
                //   System.out.println(temp[0]+" "+temp[1]);
                 prev=temp[1];
             }  
             
             
            
        }
        
        return ans;
        
    }
}
