//{ Driver Code Starts
//Initial Template for Java
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
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int l = Integer.parseInt(input[0]); 
            int r = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.sumOfAll(l,r));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int sumOfAll(int l, int r)
    {
        // code here
        
        int ans=0;
        
        for(int i=l;i<=r;i++){
            ans+=primeFactorization(i);
        }
        
        return ans;
    }
    
    private int primeFactorization(int n){
        if(n==1){
            return 1;
        }
        
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        while(n%2==0){
        if(!set.contains(2)){
        ans+=2;
        set.add(2);
        }
        n=n/2;
        }
        
        
        
        for(int i=3;i*i<=n;i++){
            
            while(n%i==0){
                if(!set.contains(i)){
                ans+=i;
                set.add(i);
                }
                n=n/i;
            }
        }
        
        if(n>2){
            if(!set.contains(n)){
            ans+=n;
            set.add(n);
            }
        }
        
        return ans;
    }
}
