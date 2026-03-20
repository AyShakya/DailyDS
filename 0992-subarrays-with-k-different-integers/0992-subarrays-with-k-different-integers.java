class Solution {
    private int f(int[] nums, int k){
        int n = nums.length;
        Map<Integer, Integer> s = new HashMap<>();
        int left = 0;
        int ans = 0;
        for(int right=0;right<n;right++){
            s.put(nums[right], s.getOrDefault(nums[right], 0)+1);
            while(s.size()>k){
                s.put(nums[left], s.get(nums[left])-1);
                if(s.get(nums[left])==0) s.remove(nums[left]);
                left++;
            }
            ans+=(right-left+1);
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return f(nums, k) - f(nums, k-1);
    }
}