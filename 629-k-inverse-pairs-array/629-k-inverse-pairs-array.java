class Solution {
    
    public int kInversePairs(int n, int k) {
        
        /*  Approach.  O(n*k)
        
            DP: dp[n][k] -> No. of arrays possible with values 1 to n and with k inverse pairs
            
            eg:  1 2 3 4 5
            
            IF we want 0 inverse pair => Cannot swap anything -> 1 2 3 4 5

            IF we want 1 inverse pair => Swap exactly 1 adjacent  

            -> 1 2 3 5 4   -> 1 2 4 3 5   -> 1 3 2 4 5   ->  2 1 3 4 5
                     ---          ---          ---           ---         (5,4), (4,3) (3,2) (2,1)  
                                                                
            
            * From 1 to n, if we keep n as the last elememt, then k inverse pair will be calculated from 1 to n-1 elements
            * From 1 to n, if we keep n as 2nd last element, then 1 inverse pair will include this 2nd last element.
                                                           rest k-1 inverse pair will be calculated from rest n-1 elements
            ...
            
            * From 1 to n, if we keep n as nth last element, then n-1 inverse pair will include this nth last element.
                                           (1st element)   rest k-(n-1) inverse pair will be calculated from rest n-1 elements.
                                           
                                           
              dp[n][k] = dp[n-1][k]+dp[n-1][k-1]+dp[n-1][k-2]+...+dp[n-1][k+1-n+1]+dp[n-1][k-n+1]
              
             
        */
        
        long mod = 1000000007L;
        
        long dp[] = new long[k+1];
        
        dp[0] = 1;
        
        for (int i=2; i<=n; i++) {
            
            long curr[] = new long[k+1];
            
            for (int j=0; j<curr.length; j++) {
                
                long currVal  = j   == 0 ? 0 : curr[j-1];  // for j=0 -> 0, else curr[j-1]
                long currDiff = j-i <  0 ? 0 : dp[j-i];
                
                curr[j] = (dp[j] + currVal - currDiff + mod) % mod;
                
            }
            
            dp = curr;
            
        }
        
        return (int) dp[k];
        
        
    }
        
        
}