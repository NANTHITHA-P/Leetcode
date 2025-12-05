class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] next: prerequisites){
            int  cou= next[0];
            int preq = next[1];
            graph.get(preq).add(cou);
            indegree[cou]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int completed = 0;
        while(!q.isEmpty()){
          int cur = q.poll();
          completed++;
          for(int next : graph.get(cur)){
              indegree[next]--;//here we are decrementing the indegree of neighbour 
              if(indegree[next]==0) {
                q.offer(next);
              }
          }
        }
        return completed == numCourses;
    }
}