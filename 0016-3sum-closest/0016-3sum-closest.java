class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i=k+1,j=nums.length-1;
            while(i<j){
                int sum=nums[k]+nums[i]+nums[j];
                map.put(sum, 1);
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
        int res=0, minlen = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(Math.abs(entry.getKey()-target)<minlen){
                minlen=Math.abs(entry.getKey()-target);
                res=entry.getKey();
            }
        }
        return res;
    }
}