class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums) sum+=i;
        if(sum-target<0 || (sum-target)%2!=0) return 0;
        int k = (sum - target)/2;
        int dp[][] = new int[n][k+1];
        if(nums[0]==0){
            dp[0][0] = 2;
        }
        else{
            dp[0][0] = 1;
        }
        if(nums[0]!=0 && nums[0]<=k){
            dp[0][nums[0]] = 1;
        }
        for(int i=1;i<n;i++){
            for(int t = 0;t<=k;t++){
                int np = dp[i-1][t];
                int p = 0;
                if(nums[i]<=t) p =dp[i-1][t-nums[i]];
                dp[i][t] = np + p;
            }
        } 
        return dp[n-1][k];
    }
}