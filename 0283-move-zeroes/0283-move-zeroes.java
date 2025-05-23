class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        int n=nums.length;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}