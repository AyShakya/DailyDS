class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int left=0,right=0;
        while(right<n-1 && left<n){
            if(nums[left]==0){
                while(nums[right]==0){
                    if(right<n-1)
                        right++;
                    else
                        break;
                }
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
            left++;
            right=left;
        }
    }
}