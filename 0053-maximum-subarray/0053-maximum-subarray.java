class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = nums[0], sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxi = maxi<sum? sum : maxi;
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
}