class Solution {
    public int minIncrementForUnique(int[] nums) {
        int c = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i+1]++;
                c++;
            }
            else if(nums[i]>nums[i+1]){
                int a = nums[i]-nums[i+1]+1;
                c+=a;
                nums[i+1] += a;
            }
        }
        return c;
    }
}