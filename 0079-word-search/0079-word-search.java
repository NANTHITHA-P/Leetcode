class Solution {
    public boolean dfs(char[][] board,int i,int j,int len,String word){
        if(len == word.length()) return true;
        if(i<0 || i>=board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(len)) return false;
        char temp = board[i][j];
        board[i][j]='#';
        boolean found = dfs(board,i+1,j,len+1,word)||
            dfs(board,i-1,j,len+1,word)||
            dfs(board,i,j-1,len+1,word)||
            dfs(board,i,j+1,len+1,word);
            board[i][j]=temp;
            return found;
    }
    public boolean exist(char[][] board, String word) {
     //boolean[] visited= new boolean[word.length()];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                  if(dfs(board,i,j,0,word)) return true;
                }
        }
        return false;
    }
}