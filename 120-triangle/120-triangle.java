/*class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       int [] t=new int[triangle.size()+1];
        
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                t[j]=Math.min(t[j],t[j+1])+triangle.get(i).get(j);
            }
        }
        
        return t[0];
    }
    
   
    
}*/

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
      
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                triangle.get(i).set(j,triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }
        
        return triangle.get(0).get(0);
    }
    
   
    
}