class Solution {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int min=time[0]*Math.abs(cur-pos[0]);
        
        for(int i=1;i<N;i++){
            int current_min=time[i]*Math.abs(cur-pos[i]);
            
            min=Math.min(current_min,min);
        }
        
        return min;
    }
}
