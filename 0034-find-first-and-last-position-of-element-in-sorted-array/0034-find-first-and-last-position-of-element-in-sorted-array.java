class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[] {-1,-1};
        }
        int left=0, right=nums.length-1,k=-1,mid=0;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                k=mid;
                break;
            }
            else{
                if(nums[mid]>target){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        if(k==-1){
            return new int[] {-1,-1};
        }
        while(k>=0 && nums[k]==target){
            k--;
        }
        while(mid<nums.length && nums[mid]==target){
            mid++;
        }
        return new int[] {k+1,mid-1};
    }
}