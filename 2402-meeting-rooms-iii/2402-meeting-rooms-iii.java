class Solution {
    public int mostBooked(int n, int[][] m) {
        long[] rAt = new long[n];
        int[] mc = new int[n];
        Arrays.sort(m, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] m1 : m) {
            int start = m1[0], end = m1[1];
            long mRat = Long.MAX_VALUE;
            int mAt = 0;
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (rAt[i] <= start) {
                    found = true;
                    mc[i]++;
                    rAt[i] = end;
                    break;
                }

                if (mRat > rAt[i]) {
                    mRat = rAt[i];
                    mAt = i;
                }
            }

            if (!found) {
                rAt[mAt] += end - start;
                mc[mAt]++;
            }
        }
        int h = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (mc[i] > h) {
                h = mc[i];
                ans = i;
            }
        }
        return ans;
    }
}