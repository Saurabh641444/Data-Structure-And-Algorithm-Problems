class Solution {
    public int minBitFlips(int start, int goal) {
        String s=Integer.toBinaryString(start);
        String e=Integer.toBinaryString(goal);
        
        System.out.println(s);
        System.out.println(e);
        
        int len= s.length()>e.length()?s.length():e.length();
        
        if(s.length()>e.length()){
            while(s.length()!=e.length()){
                e="0"+e;
            }
        }else   if(s.length()<e.length()){
            while(s.length()!=e.length()){
                s="0"+s;
            }
        }
        
        int count=0;
        for(int i=0;i<len;i++){
            
            
            if(s.charAt(i)!=e.charAt(i)){
                count++;
            }
            
           
        }
        
        return count;
    }
}