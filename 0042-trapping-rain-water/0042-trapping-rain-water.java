class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int total = 0;
        int lmax = 0, rmax = 0;
        int l = 0, r = n-1;
        while(l<r){
            if(nums[l]<=nums[r]){
                if(lmax>nums[l]){
                    total+=lmax-nums[l];
                }
                else{
                    lmax=nums[l];
                }
                l++;
            }
            else{
                if(rmax>nums[r]){
                    total +=rmax-nums[r];
                }
                else{
                    rmax=nums[r];
                }
                r--;
            }
        }
        return total;
    }
}