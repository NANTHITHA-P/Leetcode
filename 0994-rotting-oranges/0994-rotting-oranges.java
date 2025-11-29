class Solution {
    public int orangesRotting(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int fresh_orange_count = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   fresh_orange_count++;
                }
                else if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(fresh_orange_count == 0){
            return 0;
        }
        int minutes = -1;
        while(!q.isEmpty()){
            int size = q.size();
            minutes++;
            while(size-- >0)//to avoid simultaneous count of minutes for individual rottening of oranges
            {
               int[] cur = q.poll();
               int i = cur[0];
               int j = cur[1];
               if(i>0 && grid[i-1][j]==1){
                  grid[i-1][j] = 2;
                  q.offer(new int[]{i-1,j});
                  fresh_orange_count--;
               }
               if(i< r-1 && grid[i+1][j]==1){
                  grid[i+1][j] = 2;
                  q.offer(new int[]{i+1,j});
                  fresh_orange_count--;
               }
               if(j>0 && grid[i][j-1]==1){
                grid[i][j-1] = 2;
                q.offer(new int[]{i,j-1});
                fresh_orange_count--;
               }
               if(j< c-1 && grid[i][j+1]==1){
                grid[i][j+1] = 2;
                q.offer(new int[]{i,j+1});
                fresh_orange_count--;
               }
            }
        }
        return fresh_orange_count == 0 ? minutes : -1;
    }
}