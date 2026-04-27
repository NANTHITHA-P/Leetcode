class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a = new ArrayList<>();
        
        if(matrix == null || matrix.length == 0)
            return a;

        int rows = 0, rowe = matrix.length - 1;
        int cols = 0, cole = matrix[0].length - 1;

        while(rows <= rowe && cols <= cole){

            // top row
            for(int i = cols; i <= cole; i++)
                a.add(matrix[rows][i]);
            rows++;

            // right column
            for(int i = rows; i <= rowe; i++)
                a.add(matrix[i][cole]);
            cole--;

            // bottom row
            if(rows <= rowe){
                for(int i = cole; i >= cols; i--)
                    a.add(matrix[rowe][i]);
                rowe--;
            }

            // left column
            if(cols <= cole){
                for(int i = rowe; i >= rows; i--)
                    a.add(matrix[i][cols]);
                cols++;
            }
        }

        return a;
    }
}