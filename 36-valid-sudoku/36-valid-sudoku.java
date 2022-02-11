class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = board.length;
        int M = board[0].length;
        
        Set<Character> rows[] = new HashSet[N];
        Set<Character> cols[] = new HashSet[N];
        Set<Character> box[]  = new HashSet[N];
        
        // initialize input sets for rows, cols, box
        for(int i=0; i<N; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i]  = new HashSet<>();
        }
        
        for(int row=0; row<N; row++){
            for(int col=0; col<M; col++){
                
                 char value = board[row][col];
                
                // check if value is present
                if(value == '.'){
                    continue;
                }
                
                // check row
                if(rows[row].contains(value)){
                    return false;
                }
                rows[row].add(value);
                
                // check col
                if(cols[col].contains(value)){
                    return false;
                }
                cols[col].add(value);
                
                // check box
                int idx = (row/3)*3 + (col/3);
                if(box[idx].contains(value)){
                    return false;
                }
                box[idx].add(value);
            }
        }
        return true;
    }
}