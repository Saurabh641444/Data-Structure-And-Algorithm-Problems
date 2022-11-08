//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        Map<Integer,Integer> freq=new TreeMap<>(Collections.reverseOrder());
        
        for(int num:Arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> e:freq.entrySet()){
        if(e.getValue()%2!=0){
            res.add(e.getKey());
        }    
        }
        
        int ans[]=new int[res.size()];
        
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        
        return ans;
    }
}
