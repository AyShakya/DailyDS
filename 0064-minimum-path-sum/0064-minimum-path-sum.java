class Solution {
    public int minPathSum(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        int dp[] = new int[n];
        dp[0] = a[0][0];
        for(int i=0;i<m;i++){
            int []temp = new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    temp[j] = dp[0];
                    continue;
                }
                int down = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                if(i-1>=0) down = a[i][j] + dp[j];
                if(j-1>=0) right = a[i][j] + temp[j-1];
                temp[j] = Math.min(down, right);
            }
            dp = temp;
        }
        return dp[n-1];
    }
}