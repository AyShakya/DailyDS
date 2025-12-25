class Solution {
    public long maximumHappinessSum(int[] h, int k) {
        Arrays.sort(h); 
        long sum = 0;
        int dec = 0;
        for (int i = h.length - 1; i >= 0 && k-- > 0; i--) {
            sum += Math.max(h[i] - dec, 0);
            dec++;
        }
        return sum;
    }
}