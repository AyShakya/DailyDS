class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a,b) -> {
            return Integer.compare(a[0],b[0]);
        });
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a[0],b[0])
        );
        int bestPrev = 0;
        int ans = 0;
        for(int[] e : events){
            int start = e[0], end = e[1], value = e[2];
            while(!pq.isEmpty() && pq.peek()[0] < start){
                bestPrev = Math.max(bestPrev, pq.poll()[1]);
            }
            ans = Math.max(ans, bestPrev + value);
            pq.offer(new int[]{end, value});
        }
        return ans;
    }
}