class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rows = 0,rowe = n-1;
        int cols = 0,cole = n-1;
        int num = 1;
     if(n == 0){
            return matrix;
       }
       while(rows<=rowe && cols<=cole){
        for(int i = cols;i<=cole;i++){
            matrix[rows][i] = num++;
        }
        rows++;
        for(int i = rows;i<=rowe;i++){
            matrix[i][cole] = num++;
        }
        cole--;
        if(rows<=rowe){
            for(int i=cole;i>=cols;i--){
                matrix[rowe][i] = num++;
            }
          rowe--;
        }
       if(cols<=cole){
            for(int i=rowe;i>=rows;i--){
                matrix[i][cols] = num++;
            }
          cols++;
        }
       }
        return matrix;
    }
}