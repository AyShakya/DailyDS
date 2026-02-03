class Solution {
    public boolean isTrionic(int[] nums) {
        int p = -1;
        int q = -1;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i+1]>nums[i]){
                continue;
            }
            else{
                if(i==0){
                    return false;
                }
                p=i;
                break;
            }
        }
        if(p==n-2 || p==-1) return false;
        for(int i=p;i<n-1;i++){
            if(nums[i+1]<nums[i]){
                continue;
            }
            else{
                q=i;
                break;
            }
        }
        if(q==n-1 || q==-1) return false;
        for(int i=q;i<n-1;i++){
            if(nums[i+1]>nums[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}