class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        
        
        for(int i:nums){
            if(set.contains(i+k)){set2.add(i);}
            if(set.contains(i-k)){set2.add(i-k);}
            set.add(i);
        }
        return set2.size();

    }
}