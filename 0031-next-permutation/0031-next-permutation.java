class Solution {
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void next(int[] nums, int i, int j){
        if(nums[i]>nums[j]){
            swap(nums,i,j);
        }
        else{
            if(j-1>=0){
                swap(nums,i,j);
                next(nums, i-1,j-1);
            }
            else{
                Arrays.sort(nums);
            }
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n==1){
            return;
        }
        else if(n==2){
            swap(nums,0,1);
        }
        else{
            next(nums,n-1,n-2);
        }
    }
}