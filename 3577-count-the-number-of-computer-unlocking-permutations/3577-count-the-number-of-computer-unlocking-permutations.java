class Solution {
    public int countPermutations(int[] complexity) {
        int n = complexity.length;
        int val = complexity[0];
        for (int i = 1; i < n; i++) {
            if (complexity[i] <= val) {
                return 0;
            }
        }
        int ans = 1;
        int mod = 1000000007;
        for (int i = 2; i < n; i++) {
            ans = (int) (((long) ans * i) % mod);
        }
        return ans;
    }
}