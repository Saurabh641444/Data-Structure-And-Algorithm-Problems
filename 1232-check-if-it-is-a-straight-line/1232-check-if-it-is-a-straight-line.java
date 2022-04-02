class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int n=coordinates.length;
        int m=coordinates[0].length;
         
        if(n==2){ return true;}
        
        int x1=coordinates[0][0];
        int y1=coordinates[0][1];
        
        int x2=coordinates[1][0];
        int y2=coordinates[1][1];
        
        
        for(int i=2;i<n;i++){
        int x3=coordinates[i][0];
        int y3=coordinates[i][1];
            
            if((x2-x1)*(y3-y2)!=(x3-x2)*(y2-y1)){
                return false;
            }
        }
     
        return true;
    }
}