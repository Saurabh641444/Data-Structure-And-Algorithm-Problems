class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(i==m-1 && j==0){
                    arr.add(-1);
                    continue;
                }
                arr.add(matrix[i][j]);
                
                
            }
        }
        
        System.out.println(arr.size());
        
        for(int i=0;i<arr.size();i++){
           
            if(i%(n) ==0 || arr.get(i)==-1){ continue;
                      }
            else if(i-n-1>=0&&arr.get(i-n-1)!=arr.get(i)){
                 System.out.println("i= "+ i+" ->"+arr.get(i));
                System.out.println("i-n-1= "+ (i-n-1)+" ->"+arr.get(i-n-1));
                return false;
            }
            
            
        }
        return true;
    }
}