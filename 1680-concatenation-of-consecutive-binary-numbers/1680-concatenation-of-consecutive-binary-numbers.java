class Solution {
    public int concatenatedBinary(int n) {
        
         StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++){
            sb.append(Integer.toBinaryString(i));
        }
      
       String num=sb.toString();
        int base=1;
        
        int ans=0;
        
        for(int i=num.length()-1;i>=0;i--){
            
            if(num.charAt(i)=='1'){
                ans+=base;
                ans=ans%1000000007;
            }
             
            base=base*2%1000000007;
        }
        
        // System.out.println(num);
        return ans%1000000007;
        
    }
}