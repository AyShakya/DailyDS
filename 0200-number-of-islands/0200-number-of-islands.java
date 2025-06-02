class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] status = new int[n][m];
        int count = 0;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                if (grid[a][b] == '1' && status[a][b] == 0) {
                    count++;
                    q.offer(new Pair(a, b));
                    status[a][b] = 2;
                    while (!q.isEmpty()) {
                        Pair p = q.poll();
                        int i = p.first;
                        int j = p.second;
                        if (i + 1 < n && grid[i + 1][j] == '1' && status[i + 1][j] != 2) {
                            q.offer(new Pair(i + 1, j));
                            status[i + 1][j] = 2;
                        }
                        if (i - 1 >= 0 && grid[i - 1][j] == '1' && status[i - 1][j] != 2) {
                            q.offer(new Pair(i - 1, j));
                            status[i - 1][j] = 2;
                        }
                        if (j + 1 < m && grid[i][j + 1] == '1' && status[i][j + 1] != 2) {
                            q.offer(new Pair(i, j + 1));
                            status[i][j + 1] = 2;
                        }
                        if (j - 1 >= 0 && grid[i][j - 1] == '1' && status[i][j - 1] != 2) {
                            q.offer(new Pair(i, j - 1));
                            status[i][j - 1] = 2;
                        }
                    }
                }
            }
        }
        return count;
    }
}