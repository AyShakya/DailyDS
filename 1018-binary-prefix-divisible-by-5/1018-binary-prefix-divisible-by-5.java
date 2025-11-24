class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n = nums.length;
        List<Boolean> ans = new ArrayList<>();
        int num = 0;
        for(int i=0;i<n;i++){
            num = (num*2 + nums[i])%5;
            ans.add(num==0);
        }
        return ans;
    }
}