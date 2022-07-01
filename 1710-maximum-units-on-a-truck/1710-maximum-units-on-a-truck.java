class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int rem=truckSize;
        int count=0;
        for(int i=0;i<boxTypes.length;i++){
            int t=Math.min(boxTypes[i][0],rem);
            count+=t*boxTypes[i][1];
            rem-=t;
            
            if(rem==0) return count;
        }
        
        return count;
    }
}