class Solution {
    public int f(int m, int n, int[][] a, int[][] dp){
        if(m==0 && n==0){
            return a[m][n];
        }
        if(dp[m][n] != -1) return dp[m][n];
        int up = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        if(m-1>=0){
            up = a[m][n] + f(m-1, n, a, dp);
        }
        if(n-1>=0){
            left = a[m][n] + f(m, n-1, a, dp);
        }
        return dp[m][n] = Math.min(up, left);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i], -1);
        }
        return f(m-1, n-1, grid, dp);
    }
}