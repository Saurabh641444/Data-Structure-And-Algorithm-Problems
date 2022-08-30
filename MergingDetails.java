//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            List<List<String>> adj = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                List<String> l = new ArrayList<>();

                String name = sc.next();
                l.add(name);

                int tmp = sc.nextInt();

                sc.nextLine();
                for (int j = 0; j < tmp; j++) {
                    String h = sc.next();

                    l.add(h);
                }

                adj.add(l);
            }

            Solution obj = new Solution();
            List<List<String>> ans = obj.mergeDetails(adj);
            Collections.sort(ans,
                             (x, y)->{ return x.get(0).compareTo(y.get(0)); });

            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    public List<List<String>> mergeDetails(List<List<String>> details) {
        // Your code here
        List<List<String>> ans=new ArrayList<>();
        
        for(int i=0;i<details.size();i++){
            List<String> detail=details.get(i);
            
            if(detail.size()==0) continue;
            
            String name=detail.get(0);
            
            Set<String> set=new TreeSet<>();
            
            for(int j=1;j<detail.size();j++){
                set.add(detail.get(j));
            }
            
            for(int j=i+1;j<details.size();j++){
                List<String> curr=details.get(j);
                
                if(curr.size()==0) continue;
                
                for(int k=1;k<curr.size();k++){
                    
                    if(set.contains(curr.get(k)) ){
                        for(int x=1;x<curr.size();x++){
                            set.add(curr.get(x));
                        }
                        
                        curr.clear();
                        break;
                    }
                    
                }
                
            }
            
            List<String> merged=new ArrayList<>();
            merged.add(name);
            
            for(String str:set){
                merged.add(str);
            }
            
            ans.add(merged);
            
        }
        
        return ans;
    }
}
