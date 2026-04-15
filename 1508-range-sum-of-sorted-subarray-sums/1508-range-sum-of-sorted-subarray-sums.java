class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = 1000000007;
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                l.add(sum);
            }
        }
        Collections.sort(l);
        int n1=l.size();
        long lm[] = new long[n1+1];
        for(int i=0;i<n1;i++){
            lm[i+1] = (lm[i] + l.get(i))%mod;
        }
        return (int)(lm[right] - lm[left-1] + mod)%mod;
    }
}