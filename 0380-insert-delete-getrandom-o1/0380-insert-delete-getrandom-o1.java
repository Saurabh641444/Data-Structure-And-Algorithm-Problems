class RandomizedSet {
   
    ArrayList<Integer> arr;
    
    public RandomizedSet() {
        arr=new ArrayList<>();
        
    }
    
    public boolean insert(int val) {
        if(arr.contains(val)) return false;
        arr.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!arr.contains(val)) return false;
        arr.remove(Integer.valueOf(val));
        return true;
    }
    
    public int getRandom() {
        int index=(int)(Math.random()*arr.size());
        return arr.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */