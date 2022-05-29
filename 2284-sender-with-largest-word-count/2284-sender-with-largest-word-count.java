class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        int n=messages.length;
        HashMap<String,Integer> hm=new HashMap<>();
        String name=senders[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<messages.length;i++){
             
         String arr[]=messages[i].split(" ");
         hm.put(senders[i],hm.getOrDefault(senders[i],0)+arr.length);

        if(max==hm.get(senders[i])&& senders[i].compareTo(name)>=0){
              name=senders[i];
        }else if(max<hm.get(senders[i])){
              max=hm.get(senders[i]);
              name=senders[i];
           }
        }

       return name;
    }
    
    
   
}