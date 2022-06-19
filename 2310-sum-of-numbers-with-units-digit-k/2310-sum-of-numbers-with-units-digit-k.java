/*class Solution {
    public int minimumNumbers(int num, int k) {
        
        if(num==0) return 0;
        
        int sum=k,temp=num%10,size=1;
        
        while(size<=10){
            
            if(sum%10==temp) return size;
            if(sum>num) return -1;
            
            sum+=k;
            
            size++;
            
        }
        
        return -1;
        
    }
}*/

class Solution {
    public int minimumNumbers(int num, int k) {
        
        if(num==0) return 0;
        
       for(int i=1;i<=10;i++){
           if(i*k%10==num%10 && i*k<=num){
               return i;
           }
       }
        
        return -1;
        
    }
}