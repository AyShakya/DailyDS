class Solution {
    public int minimumArrayLength(int[] nums) {
        int s=nums[0];
        for(int a:nums) s=Math.min(s,a);
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%s!=0) return 1;
            if(nums[i]==s) count++;
        }
        return (count+1)/2;
    }
}