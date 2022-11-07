class Solution {
    public int maximum69Number (int num) {
        String res=""+num+"";
        
        String str="";
        
        boolean flag=false;
        
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='6' && flag==false){
                str=str+""+"9";
                flag =true;
            }else{
                str=str+""+res.charAt(i);
            }
        }
        
        return Integer.parseInt(str);
        
    }
}