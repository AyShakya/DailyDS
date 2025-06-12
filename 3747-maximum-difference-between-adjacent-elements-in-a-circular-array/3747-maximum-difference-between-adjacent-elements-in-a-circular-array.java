class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxlen=0;
        for(int i=0;i<nums.length-1;i++){
            maxlen=Math.max(maxlen, Math.abs(nums[i]-nums[i+1]));
        }
        maxlen=Math.max(maxlen, Math.abs(nums[nums.length-1]-nums[0]));
        return maxlen;
    }
}