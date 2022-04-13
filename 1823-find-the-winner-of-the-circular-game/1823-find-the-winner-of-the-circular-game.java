class Solution {
    ArrayList<Integer> arr=new ArrayList<>();
    public int findTheWinner(int n, int k) {
       
        
        for(int i=1;i<=n;i++){
        arr.add(i);
    }
       return solve(arr,0,k-1);
    
    }
    public int solve(ArrayList<Integer> arr,int start,int k){
        if(arr.size()==1){
            return arr.get(0);
        }
        
       int index=(start+k)%arr.size();
        arr.remove(index);
        
        return solve(arr,index,k);
    }
}