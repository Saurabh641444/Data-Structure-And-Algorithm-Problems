class Solution
{
    Node primeList(Node head){
        //code here
        
        if(isPrime(head.val)==false){
              head.val=getPrime(head.val);
          }
          Node curr=head;
          head=head.next;
        
        while(head!=null){
          int num=head.val;
          
          if(isPrime(num)==false){
              head.val=getPrime(num);
          }
          
          head=head.next;
          
        }
        
        return curr;
    
    }

    private int getPrime(int num){
      int count_reverse=0;
      int count_forward=0;
      int forward=2;
      int reverse=2;
      for(int i=1;i<=14;i++){
          count_forward++;
          if(isPrime(num+i)){
              forward=num+i;
              break;
          }
          
      }
      for(int i=1;i<=14;i++){
          count_reverse++;
          if(isPrime(num-i)){
              reverse=num-i;
              break;
          }
          
      }
    //   System.out.println(count_forward);
      if(count_reverse<=count_forward){
          return reverse;
      }else {
        return forward;  
      }
    }
    
    private boolean isPrime(int num){
        if(num<=1) return false;
        
        if(num==2 ||num==3) return true;
        
        if(num%2==0 || num%3==0) return false;
        
        for(int i=5;i*i<=num;i=i+6){
            if(num%i==0 || num%(i+2)==0) return false;
        
        }
        return true;
    }
}
