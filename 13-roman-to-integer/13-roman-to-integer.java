class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        hm1.put('I',1);
        hm1.put('V',5);
        hm1.put('X',10);
        hm1.put('L',50);
        hm1.put('C',100);
        hm1.put('D',500);
        hm1.put('M',1000);
        
        int n=s.length();
        
        int prev=0;
        int ans=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int val=hm1.get(ch);
             
            if(prev!=0 && prev<val){
                ans-=prev;
                val=val-prev;
            }
            ans+=val;
            System.out.println(ans+" ");
           prev=val;
        }
        
        return ans;
    }
}