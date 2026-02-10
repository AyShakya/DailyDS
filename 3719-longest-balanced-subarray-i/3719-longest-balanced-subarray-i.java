class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        int right = 0;
        int left = 0;
        for(int i=0;i<n;i++){
            Map<Integer, Integer> odd = new HashMap<>();
            Map<Integer, Integer> even = new HashMap<>();
            for(int j=i;j<n;j++){
                if(nums[j]%2!=0){
                    odd.put(nums[j], odd.getOrDefault(nums[j], 0) + 1);
                }
                else{
                    even.put(nums[j], even.getOrDefault(nums[j], 0) + 1);
                }
                if(odd.size()==even.size()){
                    maxi = Math.max(maxi, j-i+1);
                }
            }                
            }
        return maxi;
    }
}