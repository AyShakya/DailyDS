class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long pref = 0;
        long subMax = Long.MIN_VALUE;
        long[] minSo = new long[k];

        Arrays.fill(minSo, Long.MAX_VALUE / 2);
        minSo[(k - 1) % k] = 0;
        
        for (int i = 0; i < nums.length; i++) {
            pref += nums[i];
            subMax = Math.max(subMax, pref - minSo[i % k]);
            minSo[i % k] = Math.min(minSo[i % k], pref);
        }
        return subMax;
    }
}