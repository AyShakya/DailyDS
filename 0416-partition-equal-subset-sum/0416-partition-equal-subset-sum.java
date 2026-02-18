class Solution {
    public static boolean f(int n, int target, int[] a, Boolean[][] dp){
        if(target==0) return true;
        if(n<0) return false;
        if(n==0) return a[0]==target;
        if(dp[n][target]!=null) return dp[n][target];
        boolean np = f(n-1, target, a, dp);
        boolean p = false;
        if(target > a[n]){
            p = f(n-1, target - a[n], a, dp);
        }
        return dp[n][target] = p || np; 
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        if(sum%2!=0) return false;
        Boolean dp[][] = new Boolean[nums.length][sum/2 + 1];
        return f(nums.length-1, sum/2, nums, dp);
    }
}