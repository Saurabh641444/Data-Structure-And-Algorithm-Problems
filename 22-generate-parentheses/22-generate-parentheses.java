class Solution {
    public List<String> generateParenthesis(int n) {
        
        String ans="";
        int close=n;
        int open=n;
        
        List<String> list=new ArrayList<String>();
        
        solve(ans,open,close,list);
            return list;
    }
    
    public static  void solve(String ans,int open,int close,List<String> list){
        if(open==0 && close==0){ 
            list.add(ans);
            return;
        }
        
      if(open!=0){
          solve(ans+"(",open-1,close,list);
      }
        
    if(open<close){
          solve(ans+")",open,close-1,list);
      }
        
    }
}