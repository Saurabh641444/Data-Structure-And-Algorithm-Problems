class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        
        for(int factor:new int[]{2,3,5}){
            n=solve(n,factor);
        }
        
        return n==1;
    }
    
    private int solve(int a,int b){
        
        while(a%b==0){
            a=a/b;
        }
        
        return a;
    }
    
}