// class Solution {
//     // recurssion
//     public int climbStairs(int n) {
//        if(n<=2) return n;

//      return climbStairs(n-2)+ climbStairs(n-1);
   
//     }
// }

// class Solution {
//     // Solution by tabulation method
//     public int climbStairs(int n) {
//        if(n<3) return n;
      
//      int t[]=new int[n+1];
//     t[0]=0;
//    t[1]=1;
//    t[2]=2;
    
//     for(int i=3;i<t.length;i++){
//       t[i]=t[i-1]+t[i-2];
//   }
// return t[n];
   
//     }
// }

class Solution {
    // Solution by memoization method
    public int climbStairs(int n) {
       
   return Memo(n, new HashMap<Integer,Integer>());
    }

  public int Memo(int n, HashMap<Integer,Integer> map){
    if(n<0){return 0;}

     if(map.containsKey(n)){return map.get(n);}

     if(n==0){return 1;}
    
   map.put(n,Memo(n-1,map)+Memo(n-2,map));
    return map.get(n);
}
}