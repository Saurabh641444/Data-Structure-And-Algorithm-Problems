class Solution {
    private static final long MOD=(long)1e9+7;
    public int countOrders(int n) {
     long spots=2*n;
long res=1L;

for(int i=n;i!=1;i--){
   res=(res*(spots*(spots-1))/2L)%MOD;
  spots-=2;
}

  return (int) res;
    }
}