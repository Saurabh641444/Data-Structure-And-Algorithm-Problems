class Solution {
    public int subtractProductAndSum(int n) {
       
        int ans=0;
        int sum=0;
        int mul=1;
        while(n!=0){
            
           int t= n%10;
            sum+=t;
            mul*=t;
            n=n/10;
        }
        
        ans=mul-sum;
        
        return ans;
    }
}