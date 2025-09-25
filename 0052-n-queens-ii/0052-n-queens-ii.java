class Solution {
    public boolean issafe(char[][] temp,int row,int col,int n){
        for(int i=0;i<n;i++){//to check if quuen present in that col or not
            if(temp[i][col]=='Q') return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(temp[i][j]=='Q') return false;//left diagonal
        }
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(temp[i][j]=='Q') return false;
        }
        return true;
    }
    public void queen(List<List<String>> res,char[][] temp,int row,int n){
          if(row==n){
             List<String> ans = new ArrayList<>();
             for(char[] ch:temp){
                ans.add(new String(ch));
             }
             res.add(ans);
             return;
          }
          for(int j=0;j<n;j++){
            if(issafe(temp,row,j,n)){
                temp[row][j]='Q';
                queen(res,temp,row+1,n);
                temp[row][j]='.';
            }
          }
    }
    public int totalNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] temp = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[i][j]='.';
            }
        }
        queen(res,temp,0,n);
        return res.size();
    }
}