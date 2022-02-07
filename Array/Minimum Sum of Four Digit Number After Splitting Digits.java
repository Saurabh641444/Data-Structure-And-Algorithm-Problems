class Solution {
    public int minimumSum(int num) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
         while(num>0){
           q.add(num%10);
            num=num/10;
           }
         int a=0;
         int b=0;
          a=a*10+q.poll();
          b=b*10+q.poll();
          a=a*10+q.poll();
          b=b*10+q.poll();
          return a+b;
    }
}
