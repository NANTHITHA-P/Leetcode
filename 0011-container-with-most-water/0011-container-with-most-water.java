class Solution {
    public int maxArea(int[] height) {
        int  l = 0,r = height.length-1;
        int max = 0 ,minheight = 0,width = 0 ,vol =0;
        while(l<r){
          minheight = Math.min(height[l],height[r]);
          width = r - l;
          vol = minheight * width;
          max = Math.max(max,vol);

          if(height[l]<height[r]){
             l++;
          }
          else{
            r--;
          }
        }
        return max;
    }
}