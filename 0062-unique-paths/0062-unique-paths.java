class Solution {
    public int f(int m, int n, int[][] dp){
        if(m==0 && n==0){
            return dp[m][n];
        }
        if(dp[m][n] != -1) return dp[m][n];
        int left = 0;
        int right = 0;
        if(m-1>=0){
            left = f(m-1, n, dp);
        }
        if(n-1>=0){
            right = f(m, n-1, dp);
        }
        return dp[m][n] = left + right;
    }
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 1; 
        return f(m-1,n-1, dp);
    }
}