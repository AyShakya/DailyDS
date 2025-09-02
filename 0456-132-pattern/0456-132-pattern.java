class Solution {
    public boolean find132pattern(int[] nums) {
       int n = nums.length;
       int third = Integer.MIN_VALUE;
       Deque<Integer> dq = new ArrayDeque<>();
       for(int i=n-1;i>=0;i--){
        if(nums[i]<third) return true;
        while(!dq.isEmpty() && nums[i]>dq.peek()){
            third = dq.pop();
        }
        dq.push(nums[i]);
       }
       return false;
    }
}