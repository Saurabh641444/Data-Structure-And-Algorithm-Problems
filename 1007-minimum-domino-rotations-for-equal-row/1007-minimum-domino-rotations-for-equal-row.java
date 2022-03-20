// class Solution {
//     public int minDominoRotations(int[] A, int[] B) {
//         int AB=dominoRotations(A,B);
//         int BA=dominoRotations(B,A);
//         return AB==-1? BA:BA==-1? AB:Math.min(AB,BA);

//     }
    
//    public int dominoRotations(int[] A,int[] B){
//       int minRotation=Integer.MAX_VALUE;
//       for(int d=1;d<=6;d++){
//           int swap=0;
//           int i=0;
//          for(;i<A.length;i++){
//            if(A[i]==d){ continue;}
//            else if(B[i]==d){swap++;}
//            else break;
//              }
//           if(i==A.length && minRotation>swap){

//              minRotation=swap;
//           }
//         }
//       return minRotation==Integer.MAX_VALUE?-1:minRotation;
//     }
// }

class Solution {
    public int minDominoRotations(int[] top, int[] bottom) {
    int count1=0;  
    int num1=top[0]; 
        int n=top.length;
    for(int i=0;i<n;i++){
       
        if(count1!=Integer.MAX_VALUE){
             if(num1==top[i]){
               continue;
                 }else if(num1==bottom[i]){count1++;}
                else{
            count1=Integer.MAX_VALUE;}
          }
      }
   
     int count2=0;
       for(int i=0;i<n;i++){
       
        if(count2!=Integer.MAX_VALUE){
             if(num1==bottom[i]){
               continue;
                 }else if(num1==top[i]){count2++;}
                else{
            count2=Integer.MAX_VALUE;}
          }
      }

      int count3=0;
       int num2=bottom[0];
       for(int i=0;i<n;i++){
       
        if(count3!=Integer.MAX_VALUE){
             if(num2==top[i]){
               continue;
                 }else if(num2==bottom[i]){count3++;}
                else{
            count3=Integer.MAX_VALUE;}
          }
      }

       int count4=0;
       
       for(int i=0;i<n;i++){
       
        if(count4!=Integer.MAX_VALUE){
             if(num2==bottom[i]){
               continue;
                 }else if(num2==top[i]){count4++;}
                else{
            count4=Integer.MAX_VALUE;}
          }
      }

     int res=Math.min(count1,Math.min(count2,Math.min(count3,count4)));
    
    return res==Integer.MAX_VALUE? -1:res; 
    }
    
  
}