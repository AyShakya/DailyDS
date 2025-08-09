class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long minSum = 0, maxSum = 0;

        Stack<Integer> minStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            int currMin = (i == n) ? Integer.MIN_VALUE : nums[i];
            int currMax = (i == n) ? Integer.MAX_VALUE : nums[i];

            while (!minStack.isEmpty() && currMin < nums[minStack.peek()]) {
                int mid = minStack.pop();
                int left = minStack.isEmpty() ? mid + 1 : mid - minStack.peek();
                int right = i - mid;
                minSum += (long) nums[mid] * left * right;
            }
            minStack.push(i);

            while (!maxStack.isEmpty() && currMax > nums[maxStack.peek()]) {
                int mid = maxStack.pop();
                int left = maxStack.isEmpty() ? mid + 1 : mid - maxStack.peek();
                int right = i - mid;
                maxSum += (long) nums[mid] * left * right;
            }
            maxStack.push(i);
        }

        return maxSum - minSum;
    }
}