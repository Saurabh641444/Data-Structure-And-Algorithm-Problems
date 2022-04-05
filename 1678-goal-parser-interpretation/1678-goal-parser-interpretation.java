class Solution {
    public String interpret(String command) {
        if(command.length()==1){ return "G";}
        
        int n=command.length();
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n){
            if(command.charAt(i)=='G'){
                sb.append("G");
                 i++;
            }else if(command.charAt(i)=='(' &&  command.charAt(i+1)==')'){
                sb.append("o");
                i=i+2;
            }else if(command.charAt(i)=='(' &&  command.charAt(i+1)=='a' && command.charAt(i+2)=='l' && command.charAt(i+3)==')' ){
                 sb.append("al");
                i=i+4;
            }
           
        }
        
        return sb.toString();
    }
}