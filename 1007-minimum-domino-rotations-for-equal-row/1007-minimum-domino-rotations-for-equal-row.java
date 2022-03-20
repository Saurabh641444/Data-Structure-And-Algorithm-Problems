class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int AB=dominoRotations(A,B);
        int BA=dominoRotations(B,A);
        return AB==-1? BA:BA==-1? AB:Math.min(AB,BA);

    }
    
   public int dominoRotations(int[] A,int[] B){
      int minRotation=Integer.MAX_VALUE;
      for(int d=1;d<=6;d++){
          int swap=0;
          int i=0;
         for(;i<A.length;i++){
           if(A[i]==d){ continue;}
           else if(B[i]==d){swap++;}
           else break;
             }
          if(i==A.length && minRotation>swap){

             minRotation=swap;
          }
        }
      return minRotation==Integer.MAX_VALUE?-1:minRotation;
    }
}