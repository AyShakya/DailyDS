class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, ArrayList<Integer>> mx = new HashMap<>();
        Map<Integer, ArrayList<Integer>> my = new HashMap<>();
        for (int[] i : buildings) {
            int x = i[0];
            int y = i[1];
            mx.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
            my.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
        }
        for (ArrayList<Integer> list : mx.values()) {
            Collections.sort(list);
        }
        for (ArrayList<Integer> list : my.values()) {
            Collections.sort(list);
        }
        int c = 0;
        for (int i[] : buildings) {
            int x = i[0];
            int y = i[1];
            ArrayList<Integer> listx = mx.get(x);
            ArrayList<Integer> listy = my.get(y);
            int a = listx.size();
            int b = listy.size();
            if (a == 1 || listx.get(0) == y || listx.get(a - 1) == y) continue;
            if (b == 1 || listy.get(0) == x || listy.get(b - 1) == x) continue;
            c++;
        }
        return c;
    }
}