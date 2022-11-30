class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer,Integer> hm=new HashMap<>();
        
        for(int a:arr){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(list.contains(e.getValue())){
                return false;
            }
            
            list.add(e.getValue());
        }
        
        return true;
    }
}