class Solution {
    public int minimizeXor(int num1, int num2) {
        
        // int c1=setBits(num1);
        // int c2=setBits(num2);
        
       if(num1==num2) return num1;
        
        int bit=Integer.bitCount(num2);
        
        int ans=0;
        
        for(int i=31;i>=0;i--){
            int currBit=(num1>>i) &1;
            
            if(currBit==1 && bit>0){
               ans=ans | (1<<i);
                bit--;
                
            }
        }
        
        for(int i=0;i<32;i++){
            
            if(bit==0) break;
            
             int currBit=(ans>>i) &1;
            
            if(currBit !=1 ){
               ans=ans | (1<<i);
                bit--;
                
            }
            
        }
       
        
       return ans; 
        
    }
    
    private int setBits(int num){
        int count=0;
        
        while(num!=0){
            count++;
            
            num=num &(num-1);
        }
        
        return count;
    }
    
    
    
}
