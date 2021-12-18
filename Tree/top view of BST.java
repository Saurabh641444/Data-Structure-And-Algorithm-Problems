public class TopviewOfBinaryTree{
   static class data{
              Node node;
              hd=0;
              data(Node node, int hd){
                    this.node=node;
                    this.hd=hd;
                     }
       }

      static ArrayList<Integer> topView(Node root){
                  ArrayList<Integer> ans=new ArrayList<>();
                  Queue<data> q=new LinkedList();
                   
                   if(root==null){ 
                      return ans;
                           }

            HashMap<Integer,data> hm=new HashMap<>();
            int min =0;
            int max =0;
            q.add(new data(root,0));
             while(!q.isEmpty()){
                 int size=q.size();
                 for(int i=0;i<size;i++){
                          }
                 }
         }
 
}
