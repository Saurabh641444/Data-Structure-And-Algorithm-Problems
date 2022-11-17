class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int A1=(ay2-ay1)*(ax2-ax1);
        int A2=(by2-by1)*(bx2-bx1);
        int overlap=0;
        
        
        // x overlap
        
        int left=Math.max(ax1,bx1);
        int right=Math.min(ax2,bx2);
        
        int x_overlap=right-left;
        
        // y overlap
        
        left=Math.max(ay1,by1);
        right=Math.min(ay2,by2);
        
        int y_overlap=right-left;
        
        if(x_overlap>0 && y_overlap>0) overlap=y_overlap*x_overlap;
        
        return A1+A2-overlap;
    }
}