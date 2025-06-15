class Solution {
    private int binarySearch(int[] num, int x, int i, int j){
        while(i<=j){
            int mid=(i+j)/2;
            if(num[mid]==x){
                return mid;
            }
            else{
                if(num[mid]>x){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }
            else{
                return -1;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                int a = binarySearch(nums, target, i+1, nums.length-1);
                int b = binarySearch(nums, target, 0, i);
                if(a!=-1){
                    return a;
                }
                else if(b!=-1){
                    return b;
                }
                else{
                    return -1;
                }
            }
        }
        return binarySearch(nums, target,0, nums.length-1);
    }
}