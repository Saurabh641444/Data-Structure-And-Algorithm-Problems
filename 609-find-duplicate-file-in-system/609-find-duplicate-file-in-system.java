class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        
      HashMap<String,List<String>> hm=new HashMap<>();
        
        for(int i=0;i<paths.length;i++){
            String ip[]=paths[i].split(" ");
            String root=ip[0];
            
            int k=ip.length;
            
            for(int j=1;j<k;j++){
                String str=ip[j];
                String ip1[]=str.split("\\(");
                ip1[1]=ip1[1].replace(")","");
                List<String> list=hm.getOrDefault(ip1[1],new ArrayList<String>());
                list.add(root+"/"+ip1[0]);
                hm.put(ip1[1],list);
            }
        }
        
        List<List<String>> res=new ArrayList<>();
        
        for(String key:hm.keySet()){
            if(hm.get(key).size()>1){
                res.add(hm.get(key));
            }
        }
        
        return res;
        
    }
}