class Solution {
    public int f(int m, int n, int[][] a, int[][] dp){
        if(n==0 && m==0){
            return 1;
        }
        if(dp[m][n]!=-1) return dp[m][n];
        int left = 0;
        int right = 0;
        if(n-1>=0 && a[m][n-1]!=1){
            left = f(m, n-1, a, dp);
        }
        if(m-1>=0 && a[m-1][n]!=1){
            right = f(m-1, n, a, dp);
        }
        return dp[m][n] = left + right;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1) return 0;
        int dp[][] = new int[m][n];
        for(int i = 0;i<m;i++){
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 1;
        for(int i =0 ;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                int left = 0;
                int right = 0;
                if(i-1>=0 && obstacleGrid[i-1][j]!=1){
                    left = dp[i-1][j];
                }
                if(j-1>=0 && obstacleGrid[i][j-1]!=1){
                    right = dp[i][j-1];
                }
                dp[i][j] = left + right;
            }
        }
        return dp[m-1][n-1];
    }
}