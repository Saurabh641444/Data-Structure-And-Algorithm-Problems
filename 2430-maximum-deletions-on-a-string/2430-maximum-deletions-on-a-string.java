class Solution {
    Integer dp[];
    public int deleteString(String s) {
        int n=s.length();
        
        HashSet<Character> set=new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(s.charAt(i));
        }
        
        if(set.size()==1) return n;
        
        dp=new Integer[n];
        
        return recursion(s,0,n);
    }
    
    private int recursion(String s,int index,int n){
        
        if(index==n) return 0;
        
        if(dp[index]==null){
            int max=1;
            int len=(n-index)/2;
            
            for(int i=index;i<index+len;i++){
                
                String first=s.substring(index,i+1);
                String second=s.substring(i+1,2*(i+1)-index);
                
                if(first.equals(second)){
                    max=Math.max(max,recursion(s,i+1,n)+1);
                }
                
            }
            
            dp[index]=max;
        }
        
        return dp[index];
    }
}