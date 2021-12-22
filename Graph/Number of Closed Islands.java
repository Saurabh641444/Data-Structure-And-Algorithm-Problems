class Solution {
    public int closedIsland(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0 && dfs(i, j, grid) == 0) {
                    count++;
                }
            }
            
        }
        return count;
    }
    
    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 1;
        }
        if (grid[i][j] == 1) return 0;
        grid[i][j] = 1;
        return dfs(i + 1, j, grid) | dfs(i - 1, j, grid) | dfs(i, j - 1, grid) | dfs(i, j + 1, grid);
    }}
