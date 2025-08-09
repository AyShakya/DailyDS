class Solution {
    public long sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? Integer.MIN_VALUE : arr[i]; 
            while (!s.isEmpty() && curr < arr[s.peek()]) {
                int mid = s.pop();
                int left = s.isEmpty() ? mid + 1 : mid - s.peek();
                int right = i - mid;
                sum = (sum + (long) arr[mid] * left * right);
            }
            s.push(i);
        }
        return sum;
    }
    public long sumSubarrayMaxs(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? Integer.MAX_VALUE : arr[i]; 
            while (!s.isEmpty() && curr > arr[s.peek()]) {
                int mid = s.pop();
                int left = s.isEmpty() ? mid + 1 : mid - s.peek();
                int right = i - mid;
                sum = (sum + (long) arr[mid] * left * right);
            }
            s.push(i);
        }
        return sum;
    }
    public long subArrayRanges(int[] nums) {
        return (sumSubarrayMaxs(nums)-sumSubarrayMins(nums));
    }
}