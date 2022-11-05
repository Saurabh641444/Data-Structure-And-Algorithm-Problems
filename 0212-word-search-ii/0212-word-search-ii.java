/*class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        
        int m=board.length;
        int n=board[0].length;
        
        Set<String> ans=new HashSet<>();
   
    for(String str:words){ 
        if(ans.contains(str)) continue;
       for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
            if(board[i][j]==str.charAt(0) && dfs(board,str,i,j,m,n,0)){
                        ans.add(str);   
              }
           }
         }
      }    
       return new LinkedList<String>(ans); 
    }
    
    private boolean dfs(char[][] board,String str,int i,int j,int m,int n,int k){

     if(k==str.length()){
         return true;
       }      
     
    if(i>=0 && j>=0 && i<m && j<n && board[i][j]==str.charAt(k)){
        char temp=board[i][j];
        board[i][j]='A'; 

        if(dfs(board,str,i+1,j,m,n,k+1) || dfs(board,str,i-1,j,m,n,k+1) || dfs(board,str,i,j+1,m,n,k+1) || dfs(board,str,i,j-1,m,n,k+1)){
            board[i][j]=temp;
            return true;
        }
        
        board[i][j]=temp;
      }    

    return false;
   }
}*/
class Solution {
    HashMap<String,Integer> map=new HashMap<>();
     Set<String> ans=new HashSet<>();
    int max=-1;
    public List<String> findWords(char[][] board, String[] words) {
        for(int i=0;i<words.length;i++){
            map.put(words[i],1);
            max=Math.max(max,words[i].length());
        }
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<board[i].length;j++){
                boolean vis[][]=new boolean[n][board[i].length];
                StringBuilder sb=new StringBuilder();
                dfs(i,j,sb,board,vis);
            }
        }
        return new ArrayList<>(ans);
        
    }
    void dfs(int i,int j,StringBuilder sb,char board[][],boolean vis[][]){
        if(i>=0 && i<board.length && j>=0 && j<board[0].length && vis[i][j]==false && sb.length()<max){
           
            sb.append(board[i][j]);
            String x=sb.toString();
             if(map.containsKey(x))
                ans.add(x);
            vis[i][j]=true;
            dfs(i+1,j,sb,board,vis);
            dfs(i,j+1,sb,board,vis);
            dfs(i-1,j,sb,board,vis);
            dfs(i,j-1,sb,board,vis);
            vis[i][j]=false;
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
}
