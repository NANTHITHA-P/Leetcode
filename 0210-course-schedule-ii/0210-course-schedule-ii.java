class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
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
          li.add(cur);
          for(int next : graph.get(cur)){
              indegree[next]--;//here we are decrementing the indegree of neighbour 
              if(indegree[next]==0) {
                q.offer(next);
              }
          }
        }
        if(li.size()!=numCourses){
            return new int[0];
        }
        else{
            int res[] = new int[numCourses];
            int i = 0;
            for(int x : li){
                res[i++] = x;
            }
            return res;
        }
    }
}