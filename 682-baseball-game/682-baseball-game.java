class Solution {
    public int calPoints(String[] ops) {
        int res=0;
        List<Integer> list=new ArrayList<>();
        list.add(Integer.parseInt(ops[0]));
        for(int i=1;i<ops.length;i++){
              String curr=ops[i];
              if(curr.equals("+")){
                  int a=list.get(list.size()-1);
                  int b=list.get(list.size()-2);
                  int sum=a+b;
                  list.add(sum);
                 }
               else if(curr.equals("D")){
                    int a=list.get(list.size()-1);
                    int doubleNum=2*a;
                    list.add(doubleNum);
                    } else if(curr.equals("C")){
                    list.remove(list.size()-1);
                     }else{
                     int num=Integer.parseInt(curr);
                     list.add(num);
                        }
              }
           for(int val:list){
                res+=val;
           }
     return res;
    }
}