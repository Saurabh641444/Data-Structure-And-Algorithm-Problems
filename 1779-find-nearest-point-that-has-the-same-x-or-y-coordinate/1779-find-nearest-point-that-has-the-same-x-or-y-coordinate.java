class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=Integer.MAX_VALUE;
        int index=-1;
        
        for(int i=0;i<points.length;i++){
            int[] point=points[i];
            
            if(x==point[0]){
                int d=Math.abs(y-point[1]);
                if (d < min) {
                    index = i;
                    min = d;
                }
            }
           else if(y==point[1]){
                int d=Math.abs(x-point[0]);
                if (d < min) {
                    index = i;
                    min = d;
                }
            }
        }
        
        return index;
        
    }
}