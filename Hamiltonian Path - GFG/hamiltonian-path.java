//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>(); 
            for(int i = 0; i < M; i++){
                ArrayList<Integer> e = new ArrayList<Integer>();
                e.add(Integer.parseInt(input_line[2*i]));
                e.add(Integer.parseInt(input_line[2*i+1]));
                Edges.add(e);
            }
            Solution ob = new Solution();
            if(ob.check(N, M, Edges)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    int n;
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 
    { 
        // code here
        Map<Integer,ArrayList<Integer>> hm=new HashMap<>();
        n=N;
        
        for(ArrayList<Integer> edge:Edges){
           int src=edge.get(0);
           int des=edge.get(1);
           
           hm.putIfAbsent(src,new ArrayList<Integer>());
           hm.putIfAbsent(des,new ArrayList<Integer>());
           
           hm.get(src).add(des);
           hm.get(des).add(src);
        }
        
       Set<Integer> set=new HashSet<Integer> ();
        
        for(int i=1;i<=N;i++){
            if(dfs(hm,set,i)){
                return true;
            }
        }
        
        return false;
    }
    
    boolean dfs(Map<Integer,ArrayList<Integer>> hm,Set<Integer> set,int src){
        
        set.add(src);
        
        if(set.size()==n) return true;
        
        for(int des:hm.get(src)){
            if(set.contains(des)==false && dfs(hm,set,des)){
                return true;
            }
        }
        
        set.remove(src);
        return false;
    }
    
   
}