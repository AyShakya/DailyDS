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
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        int a = f(n-1, amount, coins, dp); 
        return a==2147483647? -1:a;
    }
}