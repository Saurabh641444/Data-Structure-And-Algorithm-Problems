class Solution {
    public String intToRoman(int num) {
        
        if(num<1 || num>3999) return "";
        
       String keys[]={"M", "CM", "D","CD", "C","XC","L","XL", "X", "IX", "V", "IV", "I"};
       int    val[] ={1000, 900, 500, 400, 100,  90, 50,  40,  10,    9,   5,    4,   1};
        
       StringBuilder sb=new StringBuilder();
       int i=0;
        
       while(num>0){
           while( num>=val[i]){
               num-=val[i];
               sb.append(keys[i]);
           }
           i++;
       }
        
       return sb.toString();
    }
}