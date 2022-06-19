// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        double D=(b*b-4*a*c);
        
        if(D<0){
            list.add(-1);
        }else{
             D=Math.sqrt(b*b-4*a*c);
       double r1=(-b+D)/(2*a);
        double r2=(-b-D)/(2*a);
        
        if(r1>r2){
            list.add((int)Math.floor(r1));
            list.add((int)Math.floor(r2));
        }else{
            list.add((int)Math.floor(r2));
            list.add((int)Math.floor(r1));
        }
        }
        return list;
    }
}