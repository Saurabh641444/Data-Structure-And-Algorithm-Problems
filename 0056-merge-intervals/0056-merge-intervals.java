class Solution {
    
    class Pair{
        private int start;
        private int end;
        
        Pair(int start,int end){
            this.start=start;
            this.end=end;
        }
        
        int getStart(){
            return start;
        }
        
        int getEnd(){
            return end;
        }
        
    }
    
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(int [] a,int [] b)->(a[0]!=b[0])?a[0]-b[0]:a[1]-b[1]);
        int n=intervals.length;
        
        ArrayList<Pair> res=new ArrayList<>();        
        res.add(new Pair(intervals[0][0],intervals[0][1]));
        
      int  prevStart=intervals[0][0];
      int  prevEnd=intervals[0][1];
        for(int i=1;i<n;i++){
            // System.out.println(intervals[i][0]+" "+intervals[i][1]);
           int currStart=intervals[i][0];
            int currEnd  =intervals[i][1];
            prevStart=res.get(res.size()-1).getStart();
            prevEnd=res.get(res.size()-1).getEnd();
            
            // System.out.println("currStart= "+currStart+" prevStart= "+ prevStart);
            // System.out.println("currEnd= "+currEnd+" prevEnd= "+prevEnd);
         if(  prevEnd>=currStart){
                currEnd=Math.max(currEnd,prevEnd);
                res.remove(res.size()-1);
             // System.out.println(" polled");
                res.add(new Pair(prevStart,currEnd));
            }
            else{
                res.add(new Pair(currStart,currEnd));
            
            }
            
        }
        
        int ans[][]=new int[res.size()][2];
        int i=0;
        
        while(res.size()>0){
            int start=res.get(res.size()-1).getStart();
            int end=res.get(res.size()-1).getEnd();
            res.remove(res.size()-1);
           
          
            ans[i][0]=start;
            ans[i++][1]=end;
        }
        
        return ans;
    }
}