class Solution {
    public boolean isPossible(int[] target) {
        if(target.length==1 && target[0]==1) return true;
        if(target.length==1 && target[0]!=1) return false;
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num:target){
            pq.add(num);
            sum+=num;
        }
        
        while(pq.peek()!=1){
            
            int curr=pq.poll();
            
            if(sum-curr==1){ return true;}
            
            int x=curr%(sum-curr);
            sum=sum-curr+x;
            
            if(x==0|| x==curr){return false;}
            else{pq.add(x);}
        }
        
        return true;
    }
}