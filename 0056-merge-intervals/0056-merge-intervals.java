class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) ->a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int[] cur = intervals[0];
        res.add(cur);
        for(int[] interval : intervals){
            int currentStart = cur[0];
            int currentEnd = cur[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            if(nextStart <= currentEnd){
                cur[1] = Math.max(currentEnd,nextEnd);
            }
            else{
                cur = interval;
                res.add(cur);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}