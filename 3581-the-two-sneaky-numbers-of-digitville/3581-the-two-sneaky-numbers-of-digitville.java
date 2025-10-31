class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        Boolean flag = true;
        for(int i : nums){
            if(set.add(i)){
                continue;
            }
            else{
                if(flag){
                    flag = false;
                    ans[0] = i;
                }
                else{
                    ans[1] = i;
                    break;
                }
            }
        }
        return ans;
    }
}