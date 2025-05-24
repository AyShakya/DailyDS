class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> cal = new HashMap<>();
        cal.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(cal.containsKey(nums[i])){
                int val = cal.get(nums[i]);
                if(Math.abs(val-i)<=k){
                    return true;
                }
            }
            cal.put(nums[i],i);
        }
        return false;
    }
}