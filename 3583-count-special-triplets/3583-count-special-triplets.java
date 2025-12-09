class Solution {
    private int lowerBound(ArrayList<Integer> list, int target) {
        int lo = 0, hi = list.size(); 
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (list.get(mid) >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    private int upperBound(ArrayList<Integer> list, int target) {
        int lo = 0, hi = list.size(); 
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (list.get(mid) > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    public int specialTriplets(int[] nums) {
        long ans = 0;
        int mod = 1000000007;
        int n = nums.length;
        Map<Integer, ArrayList<Integer>> m = new HashMap<>();
        for(int i=0;i<n;i++){
            int val = nums[i];
            m.computeIfAbsent(val, k -> new ArrayList<>()).add(i);
        }
        for(int i=0;i<n;i++){
            long valLong = (long) nums[i] * 2;
            if (valLong > Integer.MAX_VALUE) continue;
            int val = (int) valLong;

            ArrayList<Integer> list = m.get(val);
            if (list == null) continue;

            int c1 = lowerBound(list, i);                
            int c2 = list.size() - upperBound(list, i);  
            ans = (ans + (1L * c1 * c2) % mod) % mod;
        }
        return (int)ans;
    }
}