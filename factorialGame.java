public class Solution {
    
    public int solve(int A, int B) {
         int t[]=new int[1000001];
       int count=0;
            Arrays.fill(t,-1);
       
        for(int i=1;i<=A;i++){
            
            int ans=fact(i,t)+B;
            if(isPrime(ans)){
                count++;
            }
        }
        
        return count;
    }
    
    private int fact(int a,int [] t){
        if(a==0){
            return 1;
        }
        
        if(t[a]!=-1){
            return t[a];
        }
        return t[a]=a*fact((a-1),t);
    }
    
    private boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
        
    }
    
}
