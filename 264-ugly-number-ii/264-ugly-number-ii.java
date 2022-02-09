class Solution {
    public int nthUglyNumber(int n) {
        
     int[] t=new int[n+1];

      t[1]=1;

      int p2=1;
      int p3=1;
      int p5=1;

      for(int i=2;i<=n;i++){
      int f1=2*t[p2];
      int f2=3*t[p3];
      int f3=5*t[p5];

     int min=Math.min(f1,Math.min(f2,f3));
      t[i]=min;
     
      if(min==f1){p2++;}
      if(min==f2){p3++;}
      if(min==f3){p5++;}
          }
       return t[n];
    }
}