class Solution {
    public String addBinary(String a, String b) {
    int carry=0;// let's consider carry is zero first
    String result="";
    int i=0;// Lets consider pointer
    int alen=a.length();
    int blen=b.length();
    while(i<alen||i<blen||carry!=0){//traverse through string
        int x=0;
        if(i<alen && a.charAt(alen-1-i)=='1') x=1;
        int y=0;
        if(i<blen && b.charAt(blen-1-i)=='1') y=1;

        result=(x+y+carry)%2+result;// do the addition
        carry=(x+y+carry)/2;//find out the carry
        i++;
        
    }
    
    return result;// return result
        
    }
}