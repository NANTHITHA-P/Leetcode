class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int[][] count = new int[2*n-1][2*n-1];
        int answer = 0;
        for(int i=0;i<img1.length;i++){
            for(int j=0;j<img1[0].length;j++){
                if(img1[i][j]==1){
                    for(int k=0;k<img2.length;k++){
                        for(int l=0;l<img2[0].length;l++){
                            if(img2[k][l]==1){
                                int row = k-i;
                                int col = l - j;
                                count[row+n-1][col+n-1]++;
                                answer = Math.max(
                                    answer,
                                    count[row + n - 1][col + n - 1]
                                );
                           }
                         }
                     }
                }
            }
        }
        return answer;
    }
}