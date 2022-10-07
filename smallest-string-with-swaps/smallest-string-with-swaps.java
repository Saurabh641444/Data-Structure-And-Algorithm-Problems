class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        
        int n=s.length();
        
        UnionFind obj=new UnionFind(n);
        
        for(int i=0;i<pairs.size();i++){
         obj.union(pairs.get(i).get(0),pairs.get(i).get(1));     
        }
        
        
        HashMap<Integer,PriorityQueue<Character>> hm=new HashMap<>();
        char[] arr=s.toCharArray();
        
        for(int i=0;i<n;i++){
            int p=obj.find(i);
            PriorityQueue<Character> pq=hm.getOrDefault(p,new PriorityQueue<>());
            pq.add(arr[i]);
            hm.putIfAbsent(p,pq);
        }
        
        for(int i=0;i<n;i++){
            arr[i]=hm.get(obj.find(i)).poll();
        }
        
        return new String(arr);
        
    }
}

class UnionFind{
    int[] root;
    int[] rank;
    
    UnionFind(int V){
        root=new int[V];
        rank=new int[V];
        
        for(int i=0;i<V;i++){
          root[i]=i;
          rank[i]=1;  
        }
        
    }
    
    int find(int x){
        if(x==root[x]){
            return x;
        }
        
        return x=find(root[x]);
    }
    
    void union(int x,int y){
        int rootX=find(x);
        int rootY=find(y);
        
        if(rootX!=rootY){
            if(rank[rootX]<rank[rootY]){
                root[rootX]=rootY;
            }else if(rank[rootX]>rank[rootY]){
                root[rootY]=rootX;
            }else{
                root[rootY]=rootX;
                rank[rootX]++;
            
            }
        }
    }
    
}