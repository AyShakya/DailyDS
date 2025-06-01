class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int count=0,left=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int val = entry.getValue(); 
            if(val%2==0){
                count+=val/2;
            }
            else{
                if(val==1){
                    left++;
                }
                else{
                    left++;
                    count+=(val-1)/2;
                }
            }
        }
        int A[] = new int[] {count,left};
        return A;
    }
}