// { Driver Code Starts
//Initial Template for Java
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
            int N = sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.increasingNumbers(N);
            for(int num : ans){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> increasingNumbers(int N){
        // code here
        
        return solve(N,9,N-1);
    }
    
     static ArrayList<Integer> solve(int N,int prev,int pos){
         
         ArrayList<Integer> res=new ArrayList<Integer>();
         
         if(N==1){
             for(int j=0;j<=prev;j++){
                 res.add(j);
             }
             return res;
         }
         
         if(pos==0){
             for(int j=1;j<=prev;j++){
                 res.add(j);
             }
             return res;
         }
         
         for(int j=prev;j>=0;j--){
             ArrayList<Integer> temp=solve(N,j-1,pos-1);
             if(temp!=null)
                 for(int k=0;k<temp.size();k++){
                     temp.set(k,(j+temp.get(k)*10));
                 }
                 
             if(temp!=null)
               res.addAll(temp);
         }
                 
             
         
         Collections.sort(res);
         return res;
         
     }
}

/*class Solution{
    static ArrayList<Integer> increasingNumbers(int N){
        // code here
        
    return getnums(N,9,N-1);
    }
    
    static ArrayList<Integer> getnums(int N, int prev,int pos) {
        
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if(N==1) {
            for(int j=0;j<=prev;j++) {
                ret.add(j);
            }
            return ret;
            
        }
        if(pos == 0) {
            for(int j=1;j<=prev;j++) {
                ret.add(j);
            }
            return ret;
        }
        
        for(int j=prev;j>=0;j--) {
                 
             ArrayList<Integer> temp = getnums(N,j-1,pos-1);
            if(temp != null)
            for(int k=0;k<temp.size();k++) {
                temp.set(k,( j + temp.get(k)*10));
            }
         if(temp!=null)
            ret.addAll(temp);
        }
        Collections.sort(ret);
        return ret;
    }
}*/