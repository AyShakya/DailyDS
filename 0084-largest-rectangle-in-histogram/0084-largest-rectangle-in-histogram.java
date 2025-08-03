class Solution {
    public int largestRectangleArea(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[i]<nums[s.peek()]){
                int element = s.pop();
                int nse = i;
                int pse = s.isEmpty() ? -1 : s.peek();
                maxArea = Math.max(maxArea, (nums[element]*((nse-pse)-1)));
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int element = s.pop();
            int nse = n;
            int pse = s.isEmpty() ? -1 : s.peek();
            maxArea = Math.max(maxArea, (nums[element]*((nse-pse)-1)));
        }
        return maxArea;
    }
}