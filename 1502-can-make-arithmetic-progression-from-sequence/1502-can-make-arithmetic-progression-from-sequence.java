class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            int d=arr[i]-arr[i-1];
            set.add(d);
        }
        
        return set.size()==1? true:false;
    }
}