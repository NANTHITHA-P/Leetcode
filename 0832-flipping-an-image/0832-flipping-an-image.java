class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i=0;i<n;i++){
            int left = 0,right = n-1;
            while(left<=right){
                int a = image[i][left] ^ 1;
                int b = image[i][right] ^ 1;
                image[i][left] = b;
                image[i][right] = a;
                left++;
                right--;
            }
        }
        return image;
    }
}