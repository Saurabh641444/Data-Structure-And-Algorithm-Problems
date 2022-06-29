class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list=new ArrayList<>();
        int end=arr.length;

        while(end!=1){
            int index=find(arr,end);
            flip(arr,index);
            flip(arr,end-1);
            list.add(index+1);
            list.add(end);
            end--;
           }
        return list;
    }

    private int find(int []arr,int target){
             for(int i=0;i<arr.length;i++){
               if(arr[i]==target){ return i;}
                  }
          return -1;
         }

    private void flip(int[] arr,int end){
         int start=0;
          while(start<end){
             int temp=arr[start];
             arr[start++]=arr[end];
             arr[end--]=temp;
               }
      }
}