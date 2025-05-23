class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int n = nums.length;
        int A[] = new int[n];
        long sum=0;
        for(int i=0;i<n;i++){
            A[i]=(nums[i]^k)-nums[i];
            sum+=nums[i];
        }
        Arrays.sort(A);
        long total=0;
        for(int i=n-1;i>=1;i-=2){
           int gain = A[i]+A[i-1];
           if(gain>0){
            total+=gain;
           } 
           else{
            break;
           }
        }
        return sum+total;
    }
}