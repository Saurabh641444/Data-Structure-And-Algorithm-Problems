class Solution {
    Long dp[][];
    
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
    
        Collections.sort(robot);
        
        Arrays.sort(factory,(a,b)->a[0]-b[0]);
        
        dp=new Long[robot.size()+1][factory.length+1];
        
        return solve(robot,factory,0,0);
        
    }
    
    private long solve(List<Integer> robot,int[][] factory,int i,int j){
        if(i>=robot.size()) return 0L;
        
        if(j>=factory.length) return Long.MAX_VALUE;
        
        if(dp[i][j]!=null) return dp[i][j];
        
        long x=0;
        long res=solve(robot,factory,i,j+1);
        
        for(int k=i;k<robot.size() && k-i+1<=factory[j][1];k++){
            x+=Math.abs(robot.get(k)-factory[j][0]);
            
            long p=solve(robot,factory,k+1,j+1);
            
            if(p!=Long.MAX_VALUE) res=Math.min(res,x+p);
        }
        
        return dp[i][j]=res;
        
    }
}