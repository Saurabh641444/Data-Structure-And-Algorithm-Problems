// class Solution {
//     // recurssion
//     public int climbStairs(int n) {
//        if(n<=2) return n;

//      return climbStairs(n-2)+ climbStairs(n-1);
   
//     }
// }

class Solution {
    // Solution by tabulation method
    public int climbStairs(int n) {
       if(n<3) return n;
      
     int t[]=new int[n+1];
    t[0]=0;
   t[1]=1;
   t[2]=2;
    
    for(int i=3;i<t.length;i++){
      t[i]=t[i-1]+t[i-2];
  }
return t[n];
   
    }
}