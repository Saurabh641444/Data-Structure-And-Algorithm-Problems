class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total=0;
        
        
        
        for(int i=0;i<k;i++){
            total+=cardPoints[i];
        }
        int max=total;
        for(int i=k-1,j=cardPoints.length-1;i>=0;j--,i--){
            total+=cardPoints[j]-cardPoints[i];
            max=Math.max(max,total);
        }
        
        return max;
    }
}