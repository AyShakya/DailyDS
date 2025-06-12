class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int maxlen=Math.abs(nums[n-1]-nums[0]);
        for(int i=0;i<nums.length-1;i++){
            maxlen=Math.max(maxlen, Math.abs(nums[i]-nums[i+1]));
        }
        return maxlen;
    }
}