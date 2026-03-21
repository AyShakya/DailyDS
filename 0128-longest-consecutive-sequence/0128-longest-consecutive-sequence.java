class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums) s.add(i);
        int ans = 0;
        for(Integer i : s){
            if(!s.contains(i-1)){
                int count = 1;
                int curr = i;
                while(s.contains(curr+1)){
                    curr = curr + 1;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}