class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){

               map.put(s.charAt(i),i);
               }

        List<Integer> list=new ArrayList<Integer>();
       int prev=-1;
       int max=0;
       for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          max=Math.max(max,map.get(ch));     
          if(i==max){
               list.add(max-prev);
               prev=max;
                }
            }
      return list;
    }
}