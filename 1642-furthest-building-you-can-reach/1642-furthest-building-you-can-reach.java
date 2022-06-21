class Solution {
    public int furthestBuilding(int[] arr, int bricks, int ladders) {
        
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
      
      for(int i=0;i<arr.length-1;i++){
             if(arr[i]>=arr[i+1]) continue;
             bricks=bricks-(arr[i+1]-arr[i]);
             pq.add(arr[i+1]-arr[i]);

            if(bricks<0){
                bricks=bricks+pq.poll();
               if(ladders>0) {ladders--;}
                else return i;
                 }
           }
       return arr.length-1;
    
    }
}