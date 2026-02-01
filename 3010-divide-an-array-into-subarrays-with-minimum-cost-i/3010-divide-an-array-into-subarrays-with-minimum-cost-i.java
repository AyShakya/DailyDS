class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        nums[0] = 51;
        int mini = 51;
        int idx = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<mini){
                mini = nums[i];
                idx = i;
            }
        }
        sum += mini;
        nums[idx] = 51;
        mini = 51;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<mini){
                mini = nums[i];
                idx = i;
            }
        }
        sum+=mini;
        return sum;
    }
}