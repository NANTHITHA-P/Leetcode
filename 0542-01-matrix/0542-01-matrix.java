class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] dis = new int[r][c];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    dis[i][j]=0;
                }
                else{
                    dis[i][j] = -1;
                }
            }
        }
        int d1[] = {0,0,-1,1};
        int d2[] = {-1,1,0,0};
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int index1 = cur[0];
            int index2 = cur[1];
            for(int k=0;k<4;k++){
                int new_row = index1 + d1[k];
                int new_col = index2 + d2[k];
                if(new_row >= 0 && new_row < r && new_col >=0 && new_col < c && dis[new_row][new_col] == -1){
                    dis[new_row][new_col] = dis[index1][index2] + 1;
                    q.offer(new int[]{new_row,new_col});
                }
            }
        }
        return dis;
    }
}