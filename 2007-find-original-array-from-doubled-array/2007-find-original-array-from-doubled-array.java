class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n=changed.length;
        if(n%2==1) return new int[]{};
       Arrays.sort(changed);
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int i=0;i<n;i++){
            hm.put(changed[i],hm.getOrDefault(changed[i],0)+1);
        }
        
        int ans[]=new int[n/2];
        int k=0;
        for(int i=0;i<n;i++){
            int ele=changed[i];
            
            if(hm.containsKey(ele)){
                if(hm.containsKey(2*ele)){
                    ans[k++]=ele;
                    hm.put(ele,hm.get(ele)-1);
                    hm.put(2*ele,hm.get(2*ele)-1);
                   
                        if(hm.get(ele)==0) hm.remove(ele);
                       if(hm.containsKey(2*ele) && hm.get(2*ele)<=0 )hm.remove(2*ele);
                      
                }else{
                    return new int[0];
                }
            }
        }
        return ans;
    }
}