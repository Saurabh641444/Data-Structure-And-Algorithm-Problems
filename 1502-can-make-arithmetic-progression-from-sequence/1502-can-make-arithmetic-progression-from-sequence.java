class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // HashSet<Integer> set=new HashSet<>();
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=d) return false;
            // set.add(d);
        }
        
        return true;
    }
}