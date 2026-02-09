class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int curr = 0;
        int prev = nums[0];
        int prev1 = 0;
        for(int i=1;i<n-1;i++){
            int p = nums[i];
            if(n>1) p+=prev1;
            int np = 0 + prev;
            curr = Math.max(p, np);
            prev1 = prev;
            prev = curr;            
        }
        int ans1 = prev;
        prev = nums[1];
        prev1 = 0;
        for(int i=2;i<n;i++){
            int p = nums[i];
            if(n>2) p+=prev1;
            int np = 0 + prev;
            curr = Math.max(p, np);
            prev1 = prev;
            prev = curr;
        }
        return Math.max(ans1, prev);
    }
}