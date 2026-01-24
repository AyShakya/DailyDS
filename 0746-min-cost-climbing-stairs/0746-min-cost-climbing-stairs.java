class Solution {
    public int minCostClimbingStairs(int[] c) {
        int n = c.length;
        int[] dp = new int[n+1];
        for(int i=2;i<=n;i++){
            int l = dp[i-1] + c[i-1];
            int r = dp[i-2] + c[i-2];
            dp[i] = Math.min(l,r);
        }
        return dp[n];
    }
}