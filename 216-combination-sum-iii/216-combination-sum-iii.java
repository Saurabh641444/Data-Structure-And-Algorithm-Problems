class Solution {
   
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> ans=new ArrayList<>();
    List<Integer> res=new ArrayList<>();
        if(n==0){
            return ans;
        }
        
        solve(k,n,1,ans,res);
        
        return ans;
    }
    
    private  void solve(int k,int n,int s,List<List<Integer>> ans, List<Integer> res){
       
        
        if(n==0 && res.size()==k){
            ans.add(new ArrayList<>(res));
            return;
        }
        
        if( n<0){
            return;
        }
        
        for(int i=s;i<=9;i++){
            
                res.add(i);
            solve(k,n-i,i+1,ans,res);
            res.remove(res.size()-1);
        }
        
       
        
    }
}