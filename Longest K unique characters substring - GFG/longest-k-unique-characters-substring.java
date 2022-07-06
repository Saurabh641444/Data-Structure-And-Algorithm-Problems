// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> hm=new HashMap<>();
        
        int i=0;
        int j=0;
        int n=s.length();
        
        int max=0;
        
        while(j<n){
            char ch=s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            if(hm.size()<k){
                j++;
            }else if(hm.size()==k){
                max=Math.max(j-i+1,max);
                j++;
            }else if(hm.size()>k){
                while(hm.size()>k){
                    hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
                    if(hm.get(s.charAt(i))==0){
                        hm.remove(s.charAt(i));
                    }
                    i++;
                    if(hm.size()==k){
                max=Math.max(j-i+1,max);}
                }
                j++;
            }
        }
        if(max==0) return -1;
        return max;
    }
}