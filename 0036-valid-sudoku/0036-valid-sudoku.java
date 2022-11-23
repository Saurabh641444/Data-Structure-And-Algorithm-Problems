class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        
        HashSet<Character> row[]=new HashSet[n];
        HashSet<Character> col[]=new HashSet[n];
        HashSet<Character> box[]=new HashSet[n];
        
        for(int i=0;i<n;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            box[i]=new HashSet<>();
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char val=board[i][j];
                
                if(val=='.') continue;
                
                if(row[i].contains(val)){
                    return false;
                }
                
                row[i].add(val);
                
                if(col[j].contains(val)){
                    return false;
                }
                
                col[j].add(val);
                
                int idx=(j/3)+(i/3)*3;
                if(box[idx].contains(val)){
                    return false;
                }
                box[idx].add(val);
                 
                
            }
        }
        
        return true;
    }
}