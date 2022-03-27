// class Solution {
//     public int[] kWeakestRows(int[][] mat, int k) {
       
//      int rows=mat.length;
//      int cols=mat[0].length;
      
//      int arr[]=new int[rows];
//      for(int i=0;i<rows;i++){
//       int count1=0;
//            for(int j=0;j<cols;j++){
//                if(mat[i][j]==1){count1++;}
//               }
//              arr[i]=count1;
//          }
        
//      int ans[]=new int[k];
//      for(int i=0;i<k;i++){
//            int min=Integer.MAX_VALUE;
//            int minIndex=0;
//            for(int j=0;j<arr.length;j++){
//                if(arr[j]<min){
//                    min=arr[j];
//                    minIndex=j;
//                  }
//              }
//            ans[i]=minIndex;
//            arr[minIndex]=Integer.MAX_VALUE;
//         }
//     return ans;
        
//     }
// }


// class Solution {
//     public int[] kWeakestRows(int[][] mat, int k) {
       
//      PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> a[0]!=b[0] ? b[0]-a[0]:b[1]-a[1]);
      
//       int[] res=new int[k];
//       for(int i=0;i<mat.length;i++){
//                int count=0;
//          for(int j=0;j<mat[0].length;j++){
//               if(mat[i][j]==1){
//                      count++;
//                   }else break;
//             }
//            pq.offer(new int[]{count,i});
//          }
      
//       while(pq.size()>k){
//                 pq.poll();
//            }

//        while(k>0){res[--k]=pq.poll()[1];}
//         return res;
//     }
// }

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       
    int count[]=new int[mat.length];
      
      int[] res=new int[k];
      for(int i=0;i<mat.length;i++){
               int count1=0;
         for(int j=0;j<mat[0].length;j++){
              if(mat[i][j]==1){
                     count1++;
                  }else break;
            }
           count[i]=count1*1000+i;
         }
      
      Arrays.sort(count);

       for(int i=0;i<k;i++){
         res[i]=count[i]%1000;
        }
        return res;
    }
}