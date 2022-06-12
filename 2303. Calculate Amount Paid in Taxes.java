class Solution {
    public double calculateTax(int[][] brackets, int income) {
       double ans=0;
        int count=1;
        if(brackets[0][0]<=income){
        ans=((float)brackets[0][1]/100.0f)*((float)brackets[0][0]);
            System.out.println((float)brackets[0][1]/100.0f);
        }else{
           ans=((float)brackets[0][1]/100.f)*(float)(income); 
            count--;
        }
        
        for(int i=1;i<brackets.length;i++){
            if(count==1 && brackets[i][0]>income){
                 ans+=((float)brackets[i][1]/100.0f)*(float)(income-brackets[i-1][0]); 
                System.out.println((float)brackets[i][1]/100.0f);
                count--;
            }else if(brackets[i][0]<=income){
                 ans+=((float)brackets[i][1]/100.0f)*(float)(brackets[i][0]-brackets[i-1][0]); 
                 System.out.println((float)brackets[i][1]/100.0f);
            }
            
            
            
        }
        
        return ans;
    }
}
