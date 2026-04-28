class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a = new ArrayList<>();
        int rows = 0,rowe = matrix.length-1;
        int cols =0 ,cole = matrix[0].length-1;
        if(matrix == null || matrix.length == 0){
            return a;
       }
       while(rows<=rowe && cols<=cole){
        for(int i = cols;i<=cole;i++){
            a.add(matrix[rows][i]);
        }
        rows++;
        for(int i = rows;i<=rowe;i++){
            a.add(matrix[i][cole]);
        }
        cole--;
        if(rows<=rowe){
            for(int i=cole;i>=cols;i--){
                a.add(matrix[rowe][i]);
            }
          rowe--;
        }
       if(cols<=cole){
            for(int i=rowe;i>=rows;i--){
                a.add(matrix[i][cols]);
            }
          cols++;
        }
       }
        return a;
    }
}