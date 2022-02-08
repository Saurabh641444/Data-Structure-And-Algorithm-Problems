class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0 || g.length==0){ return 0;} 
        int content=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j=s.length-1;
        
        for(int i=g.length-1;i>=0;i--){
          if(s[j]>=g[i]){ content++; j--;
         
            }

               if(j==-1){return content;}
            }
      return content;
    }
}