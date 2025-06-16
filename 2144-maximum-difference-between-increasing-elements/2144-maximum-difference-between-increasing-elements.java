class Solution {
    public int maximumDifference(int[] nums) {
        int maxlen=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(i!=j && nums[i]<nums[j]){
                    maxlen=Math.max(maxlen, nums[j]-nums[i]);
                }
            }
        }
        return maxlen;
    }
}