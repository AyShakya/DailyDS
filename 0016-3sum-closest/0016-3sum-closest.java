class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res=0, minlen = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i=k+1,j=nums.length-1;
            while(i<j){
                int sum=nums[k]+nums[i]+nums[j];
                if(Math.abs(sum-target)<minlen){
                    minlen=Math.abs(sum-target);
                    res=sum;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    j--;
                }
                else{
                    i++;
                }
            }
        }
        return res;
    }
}