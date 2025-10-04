class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxArea=0;
        while(i<j){
            int minH = Math.min(height[i],height[j]);
            maxArea=Math.max(maxArea, minH*(j-i));
            while(i<j && height[i]<=minH){
                i++;
            }
            while(i<j && height[j]<=minH){
                j--;
            }
        }
        return maxArea;
    }
}