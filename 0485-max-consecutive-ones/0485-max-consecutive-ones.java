class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxlen=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                maxlen=Math.max(maxlen,count);
                count=0;
            }
            else{
                count++;
            }
        }
        maxlen=Math.max(maxlen,count);
        return maxlen;
    }
}