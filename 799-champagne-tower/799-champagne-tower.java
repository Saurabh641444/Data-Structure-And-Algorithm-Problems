class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
//        double[] curr_row=new double[1];
// double[] next_row=new double[2];
// curr_row[0]=poured;

// for(int row=1;row<=query_row;row++){
//    for(int glass=0;glass<row;glass++ ){
//         if(curr_row[glass]>1){
//             curr_row[glass]-=1;
//             next_row[glass]+=curr_row[glass]/2;
//             next_row[glass+1]+=curr_row[glass]/2;


//               }
//       }
//       curr_row=next_row;
//       next_row=new double[curr_row.length+1];
// }

//    return Math.min(1,curr_row[query_glass]);
        
        double[][] memo=new double[query_row+1][query_glass+2];
        memo[0][0]=poured;

       for(int i=0;i<query_row;i++){
   
            for(int j=0;j<=query_glass;j++){
               double q=Math.max(memo[i][j]-1.0,0)/2.0;
                memo[i+1][j]+=q;
                memo[i+1][j+1]+=q;
                }

                 }
 
      return Math.min(memo[query_row][query_glass],1.0);
    }
}