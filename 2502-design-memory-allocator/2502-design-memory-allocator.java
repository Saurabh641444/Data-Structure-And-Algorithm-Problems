class Allocator {
    
    int arr[];
    
    public Allocator(int n) {
        arr=new int[n];
    }
    
    public int allocate(int size, int mID) {
       
       int count=0;

       if(size>arr.length) return -1;

       for(int i=0;i<size;i++){
        if(arr[i]==0) count++;
          }

        if(count==size){
           for(int i=0;i<size;i++) arr[i]=mID;
          return 0;
           }

        for(int i=size;i<arr.length;i++){
          if(arr[i]==0) count++;
          if(arr[i-size]==0) count--;

          if(count==size){
           for(int j=i-size+1;j<=i;j++){
              arr[j]=mID;
          } 
           return i-size+1;
          } 
          }

        return -1;
    }
    
    private boolean isAvailable(int start, int size){
        int count=0;
        
        for(int i=start;i<arr.length;i++){
            
        }
        
        if(count>=size) return true;
        return false;
    }
    public int free(int mID) {
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mID) {
                arr[i]=0;
                count++;
            }
        }
        // if(count==0) return -1;
        return count;
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.free(mID);
 */