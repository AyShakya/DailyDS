class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int sum = 0;
        int j = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            while (j < n && sum<=maxCost) {
                int cost = Math.abs(s.charAt(j) - t.charAt(j));
                sum += cost;
                if(sum<=maxCost) ans = Math.max(ans, j-i+1);
                j++;
            }
            int cost = Math.abs(s.charAt(i) - t.charAt(i));
            sum = sum - cost;
        }
        return ans;
    }
}