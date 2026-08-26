class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int or = 0,oc=0,zr=0,zc = 0;
        int r = grid.length;
        int c = grid[0].length;
        int[][] diff = new int[r][c];
        int[] zero_count_row = new int[r];
        int[] zero_count_col = new int[c];
        int[] one_count_row = new int[r];
        int[] one_count_col = new int[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==0){
                    zero_count_row[i]+=1;
                }
                else{
                    one_count_row[i]+=1;
                }
            }
        }
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                if(grid[i][j]==0){
                    zero_count_col[j]+=1;
                }
                else{
                    one_count_col[j]+=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                diff[i][j] = one_count_row[i] + one_count_col[j] - zero_count_row[i] - zero_count_col[j];       
                
             }
        }
        return diff;
    }
}