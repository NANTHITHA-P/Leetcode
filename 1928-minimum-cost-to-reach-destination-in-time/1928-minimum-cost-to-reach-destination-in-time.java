class Solution {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int n = passingFees.length;
        List<int[]>[] adj = new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            int t = edge[2];
            adj[u].add(new int[]{v,t});
            adj[v].add(new int[]{u,t});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a ->a[0]));
        pq.offer(new int[]{passingFees[0],0,0});
        int minTime[] = new int[n];
        Arrays.fill(minTime,Integer.MAX_VALUE);
        minTime[0] = 0;
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int cost = cur[0];
            int time = cur[1];
            int city = cur[2];
            if(city == n-1) return cost;
            for(int[] neighbor : adj[city]){
                int nextCity = neighbor[0];
                int travelTime = neighbor[1];
                int newTime = time +travelTime;
                int newcost = cost + passingFees[nextCity];
                if(newTime <= maxTime && newTime < minTime[nextCity]){
                    minTime[nextCity] = newTime;
                    pq.offer(new int[]{newcost,newTime,nextCity});
                }
            }
        }
        return -1;
    }
} 