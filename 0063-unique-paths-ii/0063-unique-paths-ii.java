class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
            return 0;
        int dp[] = new int[n];
        dp[0] = 1;
        for(int i =0 ;i<m;i++){
            int temp[] = new int[n];
            for(int j=0;j<n;j++){
                if (obstacleGrid[i][j] == 1) {
                    temp[j] = 0;
                    continue;
                }

                if (i == 0 && j == 0) {
                    temp[j] = 1;
                    continue;
                }
                int left = 0;
                int right = 0;
                if(i>0){
                    left = dp[j];
                }
                if(j>0){
                    right = temp[j-1];
                }
                temp[j] = left + right;
            }
            dp = temp;
        }
        return dp[n-1];
    }
}