class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        long sum = 0;
        int MOD = 1_000_000_007;
        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? Integer.MIN_VALUE : arr[i]; 
            while (!s.isEmpty() && curr < arr[s.peek()]) {
                int mid = s.pop();
                int left = s.isEmpty() ? mid + 1 : mid - s.peek();
                int right = i - mid;
                sum = (sum + (long) arr[mid] * left * right) % MOD;
            }
            s.push(i);
        }
        return (int) sum;
    }
}