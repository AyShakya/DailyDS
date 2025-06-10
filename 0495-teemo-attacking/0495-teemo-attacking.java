class Solution {
    public int findPoisonedDuration(int[] x, int k) {
        if (x.length == 0) return 0;

        int total = 0;
        for (int i = 1; i < x.length; i++) {
            int diff = x[i] - x[i - 1];
            total += Math.min(diff, k); 
        }
        total += k;
        return total;
    }
}