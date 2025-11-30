class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int tarSum = 0;
        for(int num : nums) tarSum = (tarSum+num)%p;
        int sum = tarSum%p;
        if(sum==0){
            return 0;
        }
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0,-1);
        int curr = 0;
        int minLen = n;
        for(int i=0;i<n;i++){
            curr = (curr+nums[i])%p;
            int need = (curr - sum + p)%p;
            if(m.containsKey(need)){
                minLen = Math.min(minLen, i-m.get(need));
            }
            m.put(curr, i);
        }
        return minLen==n?-1:minLen;
    }
}