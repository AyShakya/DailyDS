class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        int[][] ans = new int[n][n];
        for(int i=0;i<n;i++){
            ans[0][i] = nums[i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                ans[i][j] = (ans[i-1][j]+ans[i-1][j+1])%10;
            }
        }
        return ans[n-1][0];
    }
}