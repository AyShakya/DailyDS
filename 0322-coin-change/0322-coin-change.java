class Solution {
    private int f(int n, int k, int[] arr, int dp[][]){
        if(n==0){
            if(k%arr[n]==0) return k/arr[n];
            else return Integer.MAX_VALUE;
        }
        if(dp[n][k]!=-1) return dp[n][k];
        int np = 0+ f(n-1, k, arr, dp);
        int p = Integer.MAX_VALUE;
        if(arr[n]<=k){
            int res = f(n, k-arr[n], arr, dp);
            if(res!=Integer.MAX_VALUE) p = 1 + res;
        }
        return dp[n][k] = Math.min(np, p);
    }
    public int coinChange(int[] arr, int amount) {
        int n = arr.length;
        int dp[][] = new int[n][amount+1];
        for(int i=0;i<=amount;i++){
            if(i%arr[0]==0) dp[0][i] = i/arr[0];
            else dp[0][i] = Integer.MAX_VALUE;
        }
        for(int i = 1; i<n;i++){
            for(int k=0;k<=amount;k++){
                int np = 0 + dp[i-1][k];
                int p = Integer.MAX_VALUE;
                if(arr[i]<=k){
                    int res = dp[i][k-arr[i]];
                    if(res!=Integer.MAX_VALUE) p = 1 + res;
                }
                dp[i][k] = Math.min(np, p);
            }
        }
        return dp[n-1][amount]==Integer.MAX_VALUE?-1:dp[n-1][amount];
    }
}