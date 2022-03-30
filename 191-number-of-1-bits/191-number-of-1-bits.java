// public class Solution {
//     // you need to treat n as an unsigned value
//     public int hammingWeight(int n) {
//        int count=0;
        
//         while(n!=0){
//             count+=n&1;
//             n>>>=1;
           
//         }
        
//         return count;
//     }
// }

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int count=0;
        String s=Integer.toBinaryString(n);
        
        for(char ch: s.toCharArray()){
            if(ch=='1'){
                count++;
            }
        }
        return count;
    }
}