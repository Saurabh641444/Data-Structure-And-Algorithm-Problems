class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        
        for(int k=0;k<m;k++){
            ArrayList<Integer> list=new ArrayList<>();
            int i=k;
            
            for(int j=0;j<n;j++){
                list.add(mat[i][j]);
                i++;
                
                if(i>m-1){
                    break;
                }
            }
            
            Collections.sort(list);
            
            i=k;
            
            int j=0;
               
                 for(Integer element: list){
                     
                     mat[i][j]=element;
                     i++;
                     j++;
                     
                     if(i>m-1 || j>n-1) break;
                 }     
        }
        
        
        
         for(int k=n-1;k>=0;k--){
            ArrayList<Integer> list=new ArrayList<>();
            int j=k;
            
            for(int i=0;i<m;i++){
                list.add(mat[i][j]);
                j++;
                
                if(j>n-1){
                    break;
                }
            }
            
            Collections.sort(list);
            
            j=k;
            
            int i=0;
               
                 for(Integer element: list){
                     
                     mat[i][j]=element;
                     i++;
                     j++;
                     
                     if(i>m-1 || j>n-1) break;
                 }     
        }
        
        
        
        return mat;
        
    }
}