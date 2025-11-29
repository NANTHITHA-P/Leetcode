class Solution {
    public boolean dfs(char[][] board,boolean[][] vis,int i,int j,String word,int ind){
        if(ind == word.length())//base condition when it is empty string it should be true
         return true;
         if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(ind)||vis[i][j]){//vis[i][j] true means it return false because it should be visited only once
            return false;
         }
         vis[i][j]=true;
         if(dfs(board,vis,i-1,j,word,ind+1)||dfs(board,vis,i+1,j,word,ind+1)||dfs(board,vis,i,j-1,word,ind+1)||dfs(board,vis,i,j+1,word,ind+1)) return true;
         vis[i][j]=false;
         return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,vis,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}