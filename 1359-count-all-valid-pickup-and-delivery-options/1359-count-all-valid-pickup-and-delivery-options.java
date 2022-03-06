// class Solution {
//     private static final long MOD=(long)1e9+7;
//     public int countOrders(int n) {
//      long spots=2*n;
// long res=1L;

// for(int i=n;i!=1;i--){
//    res=(res*(spots*(spots-1))/2L)%MOD;
//   spots-=2;
// }

//   return (int) res;
//     }
// }

/*Assume there were n-1 pairs Pickup and Delivery. Now we need insert the nth pair P&D.

For there were 2*(n-1) services, so we have 2*(n-1)+1 choices for the Pickup.

And now there were 2*n-1 services, so we hava 2*n choices for the Delivery.

Now, the total choices is 2*n*(2*n-1).

Because that delivery(i) is always after of pickup(i), so we need divide 2.

And for every P&D inserting, we wil hava n*(2*n - 1) choices.

OK, we will get the code as following.*/

class Solution {
    public int countOrders(int n) {
        long res = 1;
        long mod = 1000000007;
        for (int i = 1; i <= n; i++) {
            res = res * (2 * i - 1) * i % mod;
        }
        return (int)res;
    }
}
/*Time: O(N)
Space: O(1)*/