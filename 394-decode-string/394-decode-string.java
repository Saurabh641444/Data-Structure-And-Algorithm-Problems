class Solution {
  int index;  
  public String decodeString(String s) {
        index=0;
       return solve(s,new StringBuilder()).toString();
    }
   
   private StringBuilder solve(String s,StringBuilder res){
         int count=0;
        
       while(index<s.length()){
             
            if(s.charAt(index)==']'){ return res;}
            else if( Character.isDigit(s.charAt(index))){
               String countString="";
               while(Character.isDigit(s.charAt(index))){
                     countString+=String.valueOf(s.charAt(index));
                         index++;
                        }
                    count=Integer.parseInt(countString);
                     continue;
               }else if(s.charAt(index)=='['){
                       index++;
                     StringBuilder substring=solve(s,new StringBuilder());
                     for(int j=0;j<count;j++){ res.append(substring);}
                      }
                    else{
                  res.append(s.charAt(index));
                  }
              index++;
          }
           
     return res;

     }
}