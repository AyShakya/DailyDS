class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int p = 1;
        int c = 0;
        int n = nums.length;
        int l = 0;
        for(int r=0;r<n;r++){
            p*=nums[r];
            while(p>=k){
                p/=nums[l];
                l++;
            }
            c+=(r-l+1);
        }
        return c<=0?0:c;
    }
}