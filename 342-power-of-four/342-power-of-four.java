class Solution {
    public boolean isPowerOfFour(int n) {
//         int a=4;
//         int i=0;
//         int ans=1;
        
//         if(n==1) return true;
//         if(n%2==1) return false;
        
//         if(n%4==0) {
//             while(ans<n){
//                 ans=4*ans;
//             }
//             if(ans==n) return true;
//         }
//         return false;
        
        if(n<=0) return false;
        if(n==1) return true;
        
        if((n&(n-1))!=0) return false;
        
        return (n-1)%3==0;
    }
}