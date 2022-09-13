class Solution {
    public boolean validUtf8(int[] data) {
        int rbytes=0;
      
        for(int i:data){
               if(rbytes==0){
                     if((i>>7)==0b0){
                          continue;
                       }else if((i>>5)==0b110){
                         rbytes=1;
                    }else if((i>>4)==0b1110){
                         rbytes=2;
                    }else if((i>>3)==0b11110){
                         rbytes=3;
                    }else return false;
                 }else{
                      if((i>>6)==0b10){
                        rbytes--;
                       }else return false;
                 }
         }
       return rbytes==0;
    }
}