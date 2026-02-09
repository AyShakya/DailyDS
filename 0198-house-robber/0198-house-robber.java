class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int curr = 0;
        int prev = nums[0];
        int prev1 = 0;
        for(int i=1;i<n;i++){
            int p = nums[i];
            if(i>1) p += prev1;
            int np = 0 + prev;
            curr = Math.max(p, np);
            prev1 = prev;
            prev = curr;
        }
        return prev;
    }
}