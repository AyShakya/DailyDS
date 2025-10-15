class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int maxi = 1;
        int curr = 1;
        int prev = 0;
        for(int i=0;i<n-1;i++){
            if(nums.get(i)<nums.get(i+1)){
                curr++;
            }
            else{
                prev = curr;
                curr = 1;
            }
            maxi = Math.max(maxi, Math.min(curr, prev));
            maxi = Math.max(maxi, curr/2);
        }
        return maxi;
    }
}