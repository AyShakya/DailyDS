class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int[] res = new int[n];
        res[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            if(nums.get(i+1)>nums.get(i)) res[i] = res[i+1]+1;
            else res[i] = 1;
        }
        for(int i=0;i+2*k-1<n;i++){
            if(res[i]>=k && res[i+k]>=k) return true;
        }
        return false;
    }
}