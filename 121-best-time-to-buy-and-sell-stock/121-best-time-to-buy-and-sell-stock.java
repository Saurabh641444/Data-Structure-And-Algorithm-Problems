class Solution {
    public int maxProfit(int[] prices) {
      if(prices==null||prices.length<=0){return 0;}

      int profit=0;
      int minPrice=Integer.MAX_VALUE;
     for(int price:prices){
          minPrice=Math.min(price,minPrice);
          profit=Math.max(profit,price-minPrice);
         }
     return profit;
    }
}