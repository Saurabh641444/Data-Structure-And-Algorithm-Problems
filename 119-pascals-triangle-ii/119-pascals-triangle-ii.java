class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        /* Here I can see we have given the rowIndex, so i simple create pascal triangle for two rows then with the help of 1 row I will create another triangles  */
        List<Integer> res=new ArrayList<>();
        
        if(rowIndex==0){
             res.add(1);
            return res;
             }
       
         if(rowIndex==1){
        res.add(1);
        res.add(1);
        return res;
        }else{
          res.add(1);
          res.add(1);
       }

     for(int i=2;i<rowIndex+1;i++){
         
      List<Integer> temp=new ArrayList<>();
      for(int j=0;j<i+1;j++){
        if(j==0|| j==i){ temp.add(1);}
        else{
         temp.add(res.get(j-1)+res.get(j)); 
         }
          }
     res=temp;
       }
         return res;
    }
}