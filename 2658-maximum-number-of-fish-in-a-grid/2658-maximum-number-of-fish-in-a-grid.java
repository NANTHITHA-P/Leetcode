class Solution {
    public int dfs(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==0){
            return 0;
        }
        int max = grid[i][j];
        grid[i][j]=0;
        max+=dfs(grid,i-1,j);
        max+=dfs(grid,i+1,j);
        max+=dfs(grid,i,j+1);
        max+=dfs(grid,i,j-1);
        return max;
    }
    public int findMaxFish(int[][] grid) {
        int max = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                   max = Math.max(max,dfs(grid,i,j));
                }
            }
        }
        return max;
    }
}