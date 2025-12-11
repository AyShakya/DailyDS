class Solution {
    private static class Info {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;

        void add(int v) {
            count++;
            if (v < min) min = v;
            if (v > max) max = v;
        }
    }
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, Info> mx = new HashMap<>();
        Map<Integer, Info> my = new HashMap<>();
        for (int[] i : buildings) {
            int x = i[0];
            int y = i[1];
            mx.computeIfAbsent(x, k -> new Info()).add(y);
            my.computeIfAbsent(y, k -> new Info()).add(x);
        }
        int c = 0;
        for (int i[] : buildings) {
            int x = i[0];
            int y = i[1];
            Info ix = mx.get(x);
            Info iy = my.get(y);
            if (ix.count == 1 || ix.min == y || ix.max == y) continue;
            if (iy.count == 1 || iy.min == x || iy.max == x) continue;
            c++;
        }
        return c;
    }
}