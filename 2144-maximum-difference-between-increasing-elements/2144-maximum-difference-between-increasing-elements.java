class Solution {
    public int maximumDifference(int[] nums) {
        int maxlen=-1, i=0;
        for(int j=1;j<nums.length;j++){
            if(i<j && nums[i]<nums[j]){
                maxlen = Math.max(maxlen, nums[j]-nums[i]);
            }
            else{
                i=j;
            }
        }
        return maxlen;
    }
}