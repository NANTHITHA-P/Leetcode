class Solution {
    boolean touchesBoundary;
    List<int[]> cells;
    public void dfs(int i,int j,int r,int c,char[][] board,boolean[][] vis){
        if(i<0 || i>=r || j<0 ||j>=c||board[i][j]=='X'||vis[i][j]) return;
        vis[i][j] = true;
        cells.add(new int[]{i,j});
        if(i==0||j==0||i==r-1||j==c-1){
            touchesBoundary = true;
        }
        dfs(i+1,j,r,c,board,vis);
        dfs(i-1,j,r,c,board,vis);
        dfs(i,j+1,r,c,board,vis);
        dfs(i,j-1,r,c,board,vis);
    }
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        boolean[][] vis = new boolean[r][c];
        int count = 0;
        for(int i=1;i<r-1;i++){
            for(int j=1;j<c-1;j++){
                if(board[i][j] == 'O' && !vis[i][j]){
                    touchesBoundary = false;
                    cells = new ArrayList<>();
                    dfs(i,j,r,c,board,vis);

                    if(!touchesBoundary){
                        for(int[] cell : cells){
                            board[cell[0]][cell[1]] = 'X';
                        }
                    }
                }
            }
        }
    }
}