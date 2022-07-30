public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int indegree[]=new int[V];

        
        for(int i=0;i<V;i++){
            for(Integer j:adj.get(i)){
               indegree[j]++;
            }
        }
        
        Queue<Integer> q=new LinkedList<>();

      for(int i=0;i<V;i++){
          if(indegree[i]==0){
                    q.add(i);
                }
         }
     
       int count=0;
       while(q.size()>0){
            int temp=q.poll();
           count++;
          for(Integer i:adj.get(temp)){
                if(--indegree[i]==0) q.add(i);
              }
         }

      if(count==V){ return false;
     }
     return true;
    }
