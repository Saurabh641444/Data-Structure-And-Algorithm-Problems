// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String ptr, String s) {
        // code here
        
        int ans=0;
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0;i<ptr.length();i++) {
			hm.put(ptr.charAt(i), hm.getOrDefault(ptr.charAt(i),0)+1);
		}
		
		int i=0;
		int j=0;
		int k=ptr.length();
		int count=hm.size();
		while(j<s.length()) {
				if(hm.containsKey(s.charAt(j))) {
					hm.put(s.charAt(j), hm.get(s.charAt(j))-1);
					if(hm.get(s.charAt(j))==0) {
						count--;
					}
				}
			if(j-i+1<k) {
				
				j++;
			}
			else if(j-i+1==k) {
				if(count==0) {
					ans++;
				}
				if(hm.containsKey(s.charAt(i))) {

					hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
                                                                                     					if                                        (hm.get(s.charAt(i))==1) {
						count++;
					}
				}

				i++;
				j++;
			}
		}
		return ans;
    }
}