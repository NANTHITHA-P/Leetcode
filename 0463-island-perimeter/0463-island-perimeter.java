class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    // in or condition first operand checks boundary and second checks for water along with water checking we are also checking index
                    if(i==0 || (i>0 && grid[i-1][j]==0)){
                        perimeter++;
                    }
                    if(i==r-1 || (i<r && grid[i+1][j]==0)){
                        perimeter++;
                    }
                    if(j==0 ||(j>0 && grid[i][j-1]==0)){
                        perimeter++;
                    }
                    if(j==c-1 || (j<c && grid[i][j+1]==0)){
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}