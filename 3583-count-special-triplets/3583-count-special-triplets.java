class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        int MOD = 1_000_000_007;

        int MAX = 100_000;
        int[] left = new int[MAX + 1];
        int[] right = new int[MAX + 1];

        for (int x : nums) {
            right[x]++;
        }

        long ans = 0;

        for (int j = 0; j < n; j++) {
            int val = nums[j];
            right[val]--;

            int v2 = val * 2;
            if (v2 <= MAX) {
                long c1 = left[v2];   
                long c2 = right[v2];  
                ans = (ans + (c1 * c2) % MOD) % MOD;
            }
            left[val]++;
        }
        return (int) ans;
    }
}