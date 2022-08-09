class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        int MOD=1_000_000_007;
        int N=arr.length;
        
        Arrays.sort(arr);
        
        long dp[]=new long[N];
        Arrays.fill(dp,1);
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<N;i++){
            hm.put(arr[i],i);
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<i;j++){
               if(arr[i]%arr[j]==0) {
                int right=arr[i]/arr[j];
                
                if(hm.containsKey(right)){
                    dp[i]=(dp[i]+dp[j]*dp[hm.get(right)]) % MOD;
                }
                }
            }
        }
        
        long ans=0;
        
        for(long x:dp) ans+=x;
        
        return (int) (ans%MOD);
    }
}