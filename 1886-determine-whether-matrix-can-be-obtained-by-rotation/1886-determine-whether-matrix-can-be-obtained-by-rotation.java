class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
       int n=mat.length;
       boolean[] res=new boolean[4];
       Arrays.fill(res,true);

for(int i=0;i<mat.length;i++){
    for(int j=0;j<mat[0].length;j++){
        if(mat[i][j]!=target[i][j]) res[0]=false;// 0 degree
        if(mat[i][j]!=target[n-j-1][i]) res[1]=false;// 90 degree
        if(mat[i][j]!=target[n-i-1][n-j-1]) res[2]=false;//180 degree
        if(mat[i][j]!=target[j][n-i-1]) res[3]=false;//270 degree
      }
}

 return res[0]||res[1]||res[2]||res[3];
        
    }
}