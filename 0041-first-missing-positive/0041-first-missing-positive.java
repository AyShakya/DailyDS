class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> ar = new HashSet<>();
        for(int i : nums){
            ar.add(i);
        }
        int j = 1;
        while(ar.contains(j)){
            j++;
        }
        return j;
    }
}