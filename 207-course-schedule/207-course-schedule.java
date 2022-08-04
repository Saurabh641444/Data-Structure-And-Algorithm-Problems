class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean [] waitingList=new boolean[numCourses];
        boolean [] finished=new boolean[numCourses];
        
        for(int i=0;i<numCourses;i++){
            if(dfs(numCourses,prerequisites,i,waitingList,finished)==false) return false;
        }
        
        return true;
        
    }
    
    private boolean dfs(int N,int [][] arr,int s, boolean[] wait, boolean [] completed){
        if(completed[s]) return true;
        if(wait[s]) return false;
        
        
        wait[s]=true;
        
        for(int[] num:arr){
            if(num[0]==s){
                if(dfs(N,arr,num[1],wait,completed)==false){
                    return false;
                }
            }
        }
        
        wait[s]=false;
        completed[s]=true;
        return true;
    }
}