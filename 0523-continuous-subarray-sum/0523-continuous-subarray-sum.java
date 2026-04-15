class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int prefix = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            prefix+=nums[i];
            int a = prefix%k;
            if(m.containsKey(a)){
                if(i-m.get(a)>1) return true;
            }
            else m.put(a, i);
        }
        return false;
    }
}