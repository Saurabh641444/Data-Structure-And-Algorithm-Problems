class Solution {
     int[] parent=new int[26];
     int size[]=new int[26];

    public boolean equationsPossible(String[] equations) {
        
         for(int i=0;i<26;i++){
           size[i]=1;
           parent[i]=i;
          
            }

         for(String str:equations){

           if(str.charAt(1)=='='){

              int a=str.charAt(0)-'a';
              int b=str.charAt(3)-'a';
              connect(a,b);
                 }
             }

        for(String str:equations){

           
           if(str.charAt(1)=='!'){

              int a=str.charAt(0)-'a';
              int b=str.charAt(3)-'a';
              if(checkConnection(a,b)) return false;
                 }
          }
         
        return true;
    }

    public void connect (int a,int b){
       int c=findRoot(a);
       int d=findRoot(b);
       
       if(c==d) return;

       if(size[c]>=size[d]){
         parent[d]=c;
         size[c]+=size[d];
       }else{
            parent[c]=d;
         size[d]+=size[c];
          }
       
     }

     public int findRoot(int a){
      while( a>=0 && a<26 && parent[a]!=a){  
        parent[a]=parent[parent[a]];
        a=parent[a];
       }
       return a;
        }

     public boolean checkConnection(int a,int b){
        int roota =findRoot(a);
        int rootb=findRoot(b);
        
        if(roota==rootb) return true;
       return false;
     }
}