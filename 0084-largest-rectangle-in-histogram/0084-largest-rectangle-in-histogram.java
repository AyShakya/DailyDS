class Solution {
    public int largestRectangleArea(int[] nums) {
    Deque<Integer> s = new ArrayDeque<>();
    int maxArea = 0;
    int n = nums.length;

    for (int i = 0; i < n; i++) {
        while (!s.isEmpty() && nums[i] < nums[s.peekLast()]) {
            int element = s.removeLast();
            int nse = i;
            int pse = s.isEmpty() ? -1 : s.peekLast();
            maxArea = Math.max(maxArea, nums[element] * ((nse - pse) - 1));
        }
        s.addLast(i);
    }

    while (!s.isEmpty()) {
        int element = s.removeLast();
        int nse = n;
        int pse = s.isEmpty() ? -1 : s.peekLast();
        maxArea = Math.max(maxArea, nums[element] * ((nse - pse) - 1));
    }

    return maxArea;
}
}