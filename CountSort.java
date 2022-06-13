public static void count sort(int[] arr){
int min=0,max=0;
int n=arr.length;

for(int i=0;i<n;i++){
min=Math.min(arr[i],min);
max=Math.min(arr[i],max);
}

int freq[]=new int[max-min+1];

for(int i=0;i<n;i++){
    int idx=arr[i]-min;
    farr[idx]++;
   }

    for(int i=1;i<freq.length;i++){
       freq[i]=freq[i]+freq[i-1];
       }

      int[] ans=new int[arr.length];
      for(int i=arr.length-1;i>=0;i++){
           int val=arr[i];
           int pos=freq[val-min];
          ans[pos-1]=val;
          freq[val-min]--;
           }

}
