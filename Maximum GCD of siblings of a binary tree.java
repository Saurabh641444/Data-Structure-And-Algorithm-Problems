//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            
            for(int i=0; i<N-1; i++)
            {
                ArrayList<Integer> temp = new ArrayList<>();
                String S[] = read.readLine().split(" ");
                temp.add(Integer.parseInt(S[0]));
                temp.add(Integer.parseInt(S[1]));
                arr.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxBinTreeGCD(arr,N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        // code here
        
        int max=0;
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(ArrayList<Integer> al:arr){
            int node=al.get(0);
            int val1=al.get(1);
            
            int val2=hm.getOrDefault(node,0);
            
            if(val2==0){
                hm.put(node,val1);
            }else{
                int gcd=getGCD(val1,val2);
                max=Math.max(gcd,max);
                
                hm.remove(node);
            }
        }
        
        return max;
    }
    
    static int getGCD(int a,int b){
        int rem=1;
        
        while(rem!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        
        return a;
    }
};
