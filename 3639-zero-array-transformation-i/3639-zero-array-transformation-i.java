class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int count[] = new int[nums.length+1];
        for(int[] q : queries){
            int l=q[0];
            int r=q[1];
            count[l]++;
            if(r+1<count.length){
                count[r+1]--;
            }
        }
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>count[i]){
                return false;
            }
        }
        return true;
    }
}