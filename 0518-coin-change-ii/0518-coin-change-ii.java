class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        dp[0][0] = 1;
        for(int i=1;i<=amount;i++){
            if(i%coins[0]==0) dp[0][i] = 1;
            else dp[0][i] = 0;
        }
        for(int i=1;i<n;i++){
            for(int k=0;k<=amount;k++){
                int np = dp[i-1][k];
                int p = 0;
                if(coins[i]<=k){
                    p = dp[i][k-coins[i]];
                }
                dp[i][k] = np + p;
            }
        }
        return dp[n-1][amount];
    }
}