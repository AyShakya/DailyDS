class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        boolean hasBox[] = new boolean[status.length];
        boolean used[] = new boolean[status.length];
        int total = 0;
        boolean val = true;
        for (int i : initialBoxes) {
            hasBox[i] = true;
        }
        while (val) {
            val = false;
            for (int i = 0; i < status.length; ++i) {
                if (hasBox[i] && status[i] == 1 && !used[i]) {
                    total += candies[i];
                    val = true;
                    used[i] = true;
                    for (int j : keys[i]) {
                        if (status[j] == 0) {
                            status[j] = 1;
                            val = true;
                        }
                    }
                    for (int k : containedBoxes[i]) {
                        if (!hasBox[k]) {
                            hasBox[k] = true;
                            val = true;
                        }
                    }
                }
            }
        }
        return total;
    }
}