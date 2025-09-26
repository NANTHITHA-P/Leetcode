class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        List<Integer> ans = new ArrayList<>();
        for(int pair[]:prerequisites){
            int course = pair[0];
            int pre = pair[1];
            if(adj[pre]==null){
                adj[pre]=new ArrayList<>();
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
        if(ans.size()!=numCourses){
            return new int[0];
        }
       int[] result = new int[numCourses];
       for(int i=0;i<numCourses;i++){
        result[i]=ans.get(i);
       }
       return result;
    }
}