class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = 0;
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0,1);
        int prefix = 0;
        for(int i=0;i<n;i++){
            prefix+=nums[i];
            int l = prefix-goal;
            if(m.containsKey(l)){
                ans += m.get(l);
            }
            m.put(prefix, m.getOrDefault(prefix, 0)+1);
        }
        return ans;
    }
}