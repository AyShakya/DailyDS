class Solution {
    public int f(int n, int[] c, int[] dp){
        if(dp[n]!=-1) return dp[n];
        int l = f(n-1, c,dp) + c[n-1];
        int r = Integer.MAX_VALUE;
        if(n>1) r = f(n-2,c,dp) + c[n-2];
        return dp[n] = Math.min(l,r);
    }   
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 0;
        return f(n,cost,dp);
    }
}