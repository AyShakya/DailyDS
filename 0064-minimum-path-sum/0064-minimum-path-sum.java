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
    public int minPathSum(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = a[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                int down = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                if(i-1>=0) down = a[i][j] + dp[i-1][j];
                if(j-1>=0) right = a[i][j] + dp[i][j-1];
                dp[i][j] = Math.min(down, right);
            }
        }
        return dp[m-1][n-1];
    }
}