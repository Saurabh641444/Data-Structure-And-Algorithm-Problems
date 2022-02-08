class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> finalSet=new HashSet<>();
        Set<Integer> set=new HashSet<>(){{
            add(arr[0]);
           }};
        finalSet.add(arr[0]);
      
        for(int i=1;i<arr.length;i++){
    Set<Integer> newSet=new HashSet<>();
    newSet.add(arr[i]);
    finalSet.add(arr[i]);
    for(Integer j:set){
        newSet.add(j | arr[i]);
        finalSet.add(j | arr[i]);
              }
         set=newSet;
         }
      return finalSet.size();
    }
}