class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> answer = new HashMap<>();
        List<Integer> find = new ArrayList<>();
        int n=nums.length;
        int x=n/3;
        for(int i=0;i<n;i++){
            answer.put(nums[i], answer.getOrDefault(nums[i],0)+1);
            if(answer.get(nums[i])==x+1){
                find.add(nums[i]);
            }
        }
        return find;
    }
}