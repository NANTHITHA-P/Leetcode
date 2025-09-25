class Solution {
    public boolean isvalid(char[][] b,int row,int col,char ch){
        for(int i=0;i<9;i++){
            if(b[row][i]==ch) return false;
            if(b[i][col]==ch) return false;
            if(b[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==ch) return false;
        }
        return true;
    }
    public boolean solve(char[][] board){   
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char ch='1';ch<='9';ch++){
                         if(isvalid(board,i,j,ch)){
                            board[i][j]=ch;
                            if(solve(board)) return true;
                            board[i][j]='.';
                    }
                }
                return false;//return false because we can't keep upto 1 to 9 in board
            }
          }
       }
       return true;//return true if 
    }
    public void solveSudoku(char[][] board) {
       solve(board);
    }
}