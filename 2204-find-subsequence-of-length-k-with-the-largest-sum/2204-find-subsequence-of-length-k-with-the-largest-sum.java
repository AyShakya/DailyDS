class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int A[] = new int[k];
        int copy[] = Arrays.copyOf(nums,n);
        Arrays.sort(nums);
        Map<Integer, Integer> cal = new HashMap<>();
        for(int i=n-k;i<n;i++){
            cal.put(nums[i],cal.getOrDefault(nums[i],0)+1);
        }
        for(int i=0,j=0;i<n;i++){
            if(cal.containsKey(copy[i]) && cal.get(copy[i])!=0){
                A[j]=copy[i];
                cal.put(copy[i],cal.getOrDefault(copy[i],0)-1);
                j++;
            }
        }
        return A;
    }
}