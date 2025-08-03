class Solution {
    public int largestRectangleArea(int[] nums) {
        int n = nums.length;
        int index=0;
        Stack<Integer> s = new Stack<>();
        int nse[] = new int[n];
        Arrays.fill(nse, n);
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[i]<nums[s.peek()]){
                index = s.pop();
                nse[index] = i;
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            s.pop();
        }
        index=n-1;
        int pse[] = new int[n];
        Arrays.fill(pse, -1);
        for(int i = n-1;i>=0;i--){
            while(!s.isEmpty() && nums[i]<nums[s.peek()]){
                index = s.pop();
                pse[index] = i;
            }
            s.push(i);
        }
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int area = nums[i]*((nse[i]-pse[i])-1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}