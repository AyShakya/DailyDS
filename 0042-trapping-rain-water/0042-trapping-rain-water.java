class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int prefixSum[] = new int[n];
        int suffixSum[] = new int[n];
        prefixSum[0] = nums[0];
        suffixSum[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            prefixSum[i] = Math.max(prefixSum[i-1], nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            suffixSum[i] = Math.max(suffixSum[i+1], nums[i]);
        }
        int total = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<prefixSum[i] && nums[i]<suffixSum[i]){
                total += Math.min(prefixSum[i], suffixSum[i]) - nums[i];
            }
        }
        return total;
    }
}