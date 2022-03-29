class Solution {
    public static List <String> result;
    public List<String> letterCasePermutation(String s) {
        result=new ArrayList<>();
        solve(0,s,"");
        return result;
    }
    
   public static void solve(int pos,String s,String op){
         if(pos==s.length()){
            result.add(op);
          return;
           }
        char symb=s.charAt(pos);
          if(symb>='a' && symb<='z' || symb>='A' && symb<='Z' ){
           solve(pos+1,s,op+(""+symb).toLowerCase());
           solve(pos+1,s,op+(""+symb).toUpperCase());
            }
        else{
         solve(pos+1,s,op+symb);
         }
     }
}