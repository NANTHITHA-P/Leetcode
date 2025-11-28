class Solution {
    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1')
            return;
        grid[i][j] = '0';//it comes here only when grid[i][j]=1 so we are making it as 0
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
    public int numIslands(char[][] grid) {
        int numIsland = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {//checking whether it is land or water
                    numIsland++;
                    dfs(grid, i, j);
                }
            }
        } 
        return numIsland;
    }
}