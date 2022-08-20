class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
       if(startFuel>=target){
                return 0;
              }

         PriorityQueue<int[]> pq=new PriorityQueue<>((s1,s2)->{
                    return s2[1]-s1[1];});    

          int stops=0;
          int i=0,n=stations.length;

         while(startFuel<target){
                      
                  while(i<n && startFuel-stations[i][0]>=0){
                         pq.add(stations[i]);
                         i++;
                     }

                if(pq.size()==0) return -1;

                int[] refillAt=pq.poll();
                startFuel=startFuel+refillAt[1];
                stops++;

              }   
              
            return stops;

        
    }
}