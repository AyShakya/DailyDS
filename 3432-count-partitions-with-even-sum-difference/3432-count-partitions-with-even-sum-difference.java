class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            nums[i] = nums[i] + nums[i-1];
        }
        int j = n-1;
        int c=0;
        for(int i=0;i<n-1;i++){
            if(Math.abs(nums[i] - (nums[j]-nums[i]))%2==0){
                c++;
            }
        }
        return c;
    }
}