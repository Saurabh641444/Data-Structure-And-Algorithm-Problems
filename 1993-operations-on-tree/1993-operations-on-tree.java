class LockingTree {
    int[] parent;
    Map<Integer,Integer> locked;
    List<Integer>[] tree;
    
    public LockingTree(int[] parent) {
        this.parent=parent;
        int n=parent.length;
        tree=new ArrayList[n];
        locked=new HashMap<>();
        
        for(int i=0;i<n;i++){
            tree[i]=new ArrayList<>();
        }
        
        for(int i=1;i<n;i++){
            tree[parent[i]].add(i);
        }
    }
    
    public boolean lock(int num, int user) {
        if(locked.containsKey(num)) return false;
        locked.put(num,user);
        return true;
    }
    
    public boolean unlock(int num, int user) {
        
        if(locked.containsKey(num)==false || locked.get(num)!=user ) return false;
        locked.remove(num,user);
        return true;
    }
    
    public boolean upgrade(int num, int user) {
        // check if the given number is locked or not
        if(locked.containsKey(num)) return false;
        
        // check the ancenstors of number
        int curr=num;
        while(curr!=-1){
            curr=parent[curr];
            if(locked.containsKey(curr)) return false;

        }
        
        int temp=locked.size();
        dfs(num);
        if(temp==locked.size()) return false;
        
        locked.put(num,user);
        return true;
        
    }
    
    private void dfs(int src){
        if(locked.containsKey(src)){
            locked.remove(src);
        }
        
        for(int neighbour:tree[src]){
            dfs(neighbour);
        }
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */