class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        List<List<Integer>> result=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        
        for(int [] row:grid){
            for(int ele:row){
            al.add(ele);
                }
        }
        
        while(k-->0){
            al.add(0,al.remove(al.size()-1));
        }
        
        int index=0;
        
        for(int i=0;i<n;i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<m;j++){
                temp.add(al.get(index++));
            }
            
            result.add(temp);
        }
        
        return result;
    }
}