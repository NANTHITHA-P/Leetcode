class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        int[] indegree = new int[numCourses];
        List<Integer> ans = new ArrayList<>();//to append topological sort answers
        for(int[] pair:prerequisites){
            int course = pair[0];
            int pre = pair[1];
            if(adj[pre]==null){//seeing whether that list is null or not (ie) any outdegree is present for that vertex or not
                adj[pre] = new ArrayList<>();
            }
            adj[pre].add(course);
            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
         while(!q.isEmpty()){
            int cur = q.poll();
            ans.add(cur);
            if(adj[cur]!=null){
                for(int next : adj[cur]){
                    indegree[next]--;
                    if(indegree[next]==0){
                        q.offer(next);
                    }
                }
            }
         }
         return ans.size()==numCourses;
    }
}