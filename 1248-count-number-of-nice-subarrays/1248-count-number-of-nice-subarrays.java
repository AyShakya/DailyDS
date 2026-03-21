class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;
        int prefix = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0,1);
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0) prefix++;
            int l = prefix-k;
            if(m.containsKey(l)){
                ans += m.get(l);
            }
            m.put(prefix, m.getOrDefault(prefix, 0)+1);
        }
        return ans;
    }
}