class Solution {
    public int addDigits(int n) {
        
        if(n<10){return n;}
        
        int sum=0;
        int temp=n;
        
        while(temp!=0){
            sum=sum+temp%10;
            temp=temp/10;
        }
        return addDigits(sum);
    }
    
  
}