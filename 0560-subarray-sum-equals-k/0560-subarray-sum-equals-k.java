class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum=0, c=0, n=nums.length;
        for(int i=0;i<n;i++){
            prefixSum += nums[i];
            int a = prefixSum-k;
            if(map.containsKey(a)){
                c+=map.get(a);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        }
        return c;
    }
}