class Solution {
    public int mirrorReflection(int p, int q) {
        /* extention*p=reflection*q*/
        
        // if extention==even and reflection is odd then result 0
        // if extention is odd and reflection is even the result 2
        // if extention is odd and reflection is odd the rsult 1
        int ext=q,ref=p;
        while(ext%2==0 && ref%2==0){
            ext/=2;
            ref/=2;
        }
        
        if(ext%2==0 && ref%2==1) return 0;
        
          if(ext%2==1 && ref%2==1) return 1;
          if(ext%2==1 && ref%2==0) return 2;
        
        return -1;
    }
}