class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] m : meetings) {
            graph.computeIfAbsent(m[0], k -> new ArrayList<>()).add(new int[]{m[1], m[2]});
            graph.computeIfAbsent(m[1], k -> new ArrayList<>()).add(new int[]{m[0], m[2]});
        }

        int[] earliest = new int[n];
        Arrays.fill(earliest, Integer.MAX_VALUE);
        earliest[0] = 0;
        earliest[firstPerson] = 0;

        // Min-heap: (time, person)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0});
        pq.offer(new int[]{0, firstPerson});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int time = cur[0], person = cur[1];

            if (time > earliest[person]) continue;

            for (int[] next : graph.getOrDefault(person, Collections.emptyList())) {
                int nextPerson = next[0], meetTime = next[1];

                if (meetTime >= time && meetTime < earliest[nextPerson]) {
                    earliest[nextPerson] = meetTime;
                    pq.offer(new int[]{meetTime, nextPerson});
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (earliest[i] != Integer.MAX_VALUE) ans.add(i);
        }
        return ans;
    }
}
