class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int p = 0; p < nums.length - 2; p++) {
            for (int k = p + 1; k < nums.length - 2; k++) {
                int i = k + 1, j = nums.length - 1;
                while (i < j) {
                    long sum = (long) nums[k] + nums[i] + nums[j] + nums[p];
                    if (sum == (long)target) {
                        result.add(Arrays.asList(nums[p], nums[k], nums[i], nums[j]));
                        i++;
                        j--;
                    } else if (sum > (long)target) {
                        j--;
                    } else {
                        i++;
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(result);
        return list;
    }
}