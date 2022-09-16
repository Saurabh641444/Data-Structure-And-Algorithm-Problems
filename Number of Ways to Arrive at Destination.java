//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
// Position this line where user code will be pasted.

class GFG {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                List<Integer> temp = new ArrayList<>();
                for (int j = 0; j < 3; j++) {
                    int x = sc.nextInt();
                    temp.add(x);
                }
                adj.add(temp);
            }

            Solution obj = new Solution();
            System.out.println(obj.countPaths(n, adj));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    static int countPaths(int n, List<List<Integer>> roads) {
        // Your code here
        /*
          1. By just reading city consist of 0 to n-1 itersections , I quily thought about Dijistra's algo
          2. Here in order to apply dijistra's algorithm we need to convert given 2D list intro adjacency list.
          3. 
        */
        List<List<int []>> graph=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<int []>());
        }
        
        for(List<Integer> i:roads){
            graph.get(i.get(0)).add(new int[]{i.get(1),i.get(2)});
            graph.get(i.get(1)).add(new int[]{i.get(0),i.get(2)});

        }
        
        int[] dist=new int[n];
        int[] ways=new int[n];
        
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        dist[0]=0;
        ways[0]=1;
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->(a[1]-b[1]));
        
        pq.add(new int[]{0,0});
        
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int u=curr[0];
            int w1=curr[1];
            
            if(dist[u]<w1) continue;
            
            for(int arr[]:graph.get(u)){
                
                int v=arr[0];
                int w2=arr[1];
                
                if(dist[v]>w2+dist[u]){
                    dist[v]=w2+dist[u];
                    ways[v]=ways[u];
                    pq.add(new int[]{arr[0],dist[v]});
                }else if(dist[v]==w2+dist[u]){
                    ways[v]=(ways[v]+ways[u])%1000000007;
                    
                }
            }
            
        }
        return ways[n-1];
    }
}
